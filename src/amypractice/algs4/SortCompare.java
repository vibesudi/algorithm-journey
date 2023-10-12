package amypractice.algs4;

import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.Insertion;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

/**
 * 比较两种排序算法
 */
public class SortCompare {
    private static final boolean needAutoInit = false;

    public static double time(String alg, Comparable[] a) {  /* 请见前面的正文 */
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        if (alg.equals("Shell")) Shell.sort(a);
        if (alg.equals("Merge")) Merge.sort(a);
        if (alg.equals("Quick")) Quick_.sort(a);
        if (alg.equals("Heap")) Heap.sort(a);
        Quick.sort(a);
        return timer.elapsedTime();
    }


    public static double timeRandomInput(String alg, int N, int T) {  // 使用算法alg将T个长度为N的数组排序
        double total = 0.0;
        Integer[] a;
        if (needAutoInit) {
            a = new Integer[N];
        } else {
            a = new Integer[]{20, 93, 69, 52, 17 ,15, 11, 44, 92, 41, 18};
        }
        for (int t = 0; t < T; t++) {  // 进行一次测试（生成一个数组并排序)
            if (needAutoInit) {
                for (int i = 0; i < N; i++) {
                    a[i] = StdRandom.uniform(99);
                }
            }
            show(a);
            total += time(alg, a);
            //StdOut.printf("%s : %.4f\n", alg, total);
            // StdOut.println(Arrays.toString(a));
        }
        return total;
    }

    public static double timeRandomInputString(String alg, int N, int T) {  // 使用算法alg将T个长度为N的数组排序
        double total = 0.0;
        String[] a = new String[]{"K", "R", "A", "T", "E", "L", "E", "P", "U", "I", "M", "Q", "C", "X", "O", "S"};

        for (int t = 0; t < T; t++) {  // 进行一次测试（生成一个数组并排序)
            show(a);
            total += time(alg, a);
        }
        return total;
    }

    // print array to standard output
    private static void show(Comparable[] a) {
        //StdOut.println("Inital  Array:" + Arrays.toString(a));
        StdOut.print("OutArrayIndex:[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                StdOut.printf("%2d", i);
            } else {
                StdOut.printf("%2d, ", i);
            }
        }
        StdOut.print("]\n");

        StdOut.print("Inital  Array:[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                StdOut.printf("%2d", a[i]);
            } else {
                StdOut.printf("%2d, ", a[i]);
            }
        }
        StdOut.print("]\n");
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

        //double div = timeRandomInput2(alg1, alg2, N, T);
        //StdOut.printf("For %d random Doubles\n    ", N);
        //StdOut.printf("%s 除以 %s times: %.4f \n", alg1, alg2, div);
        //--------------
        timeRandomInput("Quick", 10, 1); // 快速排序调试
        //timeRandomInputString("Quick", 10, 1); // 快速排序调试 《算法第四版》书中例子 Page.184
    }
}
