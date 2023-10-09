package amypractice.sort;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 排序算法类的模板
 *
 */
public abstract class Example {

    abstract void sort(Comparable[] a);


    public static Example getInstance() {
        return null;
    }

    // 对元素比较：is v < w ?
    public static boolean less(Comparable v, Comparable m) {
        return v.compareTo(m) < 0;
    }

    // 将元素交换位置：exchange a[i] and a[j]
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        // 在单行中打印数组
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
        // System.out.println(Arrays.toString(a));
    }

    // 测试数组元素是否有序
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public void test() {
        // 从标准输入读取字符串，将他们排序并输出
        // String[] a = new In().readAllStrings();
        Integer[] a = genArr();
        //Quick.sort(a);
        sort(a);
        assert isSorted(a);
        show(a);
    }

    public static Integer[] genArr() {
        int size = 20; // 数组大小
        int min = 10; // 随机数最小值
        int max = 99; // 随机数最大值
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void main(String[] args) {
        // test();
    }

}
