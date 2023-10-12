package amypractice.algs4;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.awt.*;

/**
 * 临时类，写一些小测试
 */
public class ATemp {

    public static void main(String[] args) {
        m2();

    }

    // break 调出整个循环，continue跳出本次循环
    public static void m1() {
        int i = 0, j = 0;
        while (true) {
            if (i > 10) break;
            System.out.printf("i: %d\n", i++);
            while (true) {
                if (j > 5) break;
                System.out.printf("j: %d\n", j++);
            }
        }
    }

    public static void m2() {
        StdOut.println(Double.NaN);
        StdOut.println(Double.POSITIVE_INFINITY);
        StdOut.println(1.0/0.0);
    }

    public static void m3() {
        StdDraw.setPenColor(Color.cyan);
        StdDraw.circle( 0.5, 0.5, 0.3);
    }

    public static void m4() {
        StdOut.println(Math.abs(-2147483648)); // 整数溢出
    }

}
