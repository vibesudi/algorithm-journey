package amypractice.algs4;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.awt.*;
import java.util.Date;

/**
 * 临时类，写一些小测试
 */
public class ATemp {

    public static void main(String[] args) {
//        // m2();
//        String a = new String("asdacsxdsdg");
//        //Date a;
//        System.out.println(a.hashCode());
//        a = "0123456789";
//        System.out.println(a.substring(1, 5));
        // -----------
        Bag bag = new Bag();
        bag.add(1);
        bag.add("123");
        bag.add("456");
        bag.add("789");
        bag.add("JQK");
        for (Object o : bag) {
            System.out.println(o);
        }

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
