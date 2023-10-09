package amypractice.algs4;

import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.Insertion;

/**
 * 比较两种排序算法
 */
public class SortCompare {
    public static double time(String alg, Double[] a) {  /* 请见前面的正文 */
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        if (alg.equals("Shell")) Shell.sort(a);
        if (alg.equals("Merge")) Merge.sort(a);
        if (alg.equals("Quick")) Quick.sort(a);
        if (alg.equals("Heap")) Heap.sort(a);
        return timer.elapsedTime();
    }


    public static double timeRandomInput(String alg, int N, int T) {  // 使用算法alg将T个长度为N的数组排序
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {  // 进行一次测试（生成一个数组并排序)
            for (int i = 0; i < N; i++)
                a[i] = StdRandom.uniform();
            total += time(alg, a);
        }
        return total;
    }

    public static double timeRandomInput2(String alg1, String alg2, int N, int T) {  // 使用算法alg将T个长度为N的数组排序
        double total1 = 0.0;
        double total2 = 0.0;
        Double[] a = new Double[N];
        Double[] b = new Double[N];
        for (int t = 0; t < T; t++) {  // 进行一次测试（生成一个数组并排序)
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
                b[i] = a[i];
            }
            total2 += time(alg2, b);
            total1 += time(alg1, a);
        }
        StdOut.printf("%s : %.4f\n", alg1, total1);
        StdOut.printf("%s : %.4f\n", alg2, total2);
        return total1 / total2;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]); // 长度为N
        int T = Integer.parseInt(args[3]); // T个数组
        //double t1 = timeRandomInput(alg1, N, T); // 算法1的总时间
        //double t2 = timeRandomInput(alg2, N, T); // 算法2的总时间
        //StdOut.printf("For %d random Doubles\n", N);
        //StdOut.printf("    %s : %.4f \n", alg1, t1);
        //StdOut.printf("    %s : %.4f \n", alg2, t2);
        //StdOut.printf("    %s is %.1f times faster than %s\n", alg1, t2 / t1, alg2);
        double div = timeRandomInput2(alg1, alg2, N, T);
        StdOut.printf("For %d random Doubles\n    ", N);
        StdOut.printf("%s 除以 %s times: %.4f \n", alg1, alg2, div);
    }
}
