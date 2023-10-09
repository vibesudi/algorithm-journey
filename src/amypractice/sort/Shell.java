package amypractice.sort;

/**
 * 希尔排序：希尔排序是插入排序的一种更高效率的实现。
 * 使数组分组有序
 */
public class Shell extends Example {

    // is the array h-sorted?
    private static boolean isHsorted(Comparable[] a, int h) {
        for (int i = h; i < a.length; i++)
            if (less(a[i], a[i-h])) return false;
        return true;
    }


    @Override
    public void sort(Comparable[] a) {

        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
        }
        while (h >= 1) {
            // 将数组变为h有序
            for (int i = h; i < N; i++) {
                // 将a[i] 插入到a[i - h]、a[i - 2 * h]、a[i - 3 * h]...之中
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }


    public void sort1(Comparable[] a) {
        int n = a.length;

        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ...
        int h = 1;
        while (h < n/3) h = 3*h + 1;

        while (h >= 1) {
            // h-sort the array
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            assert isHsorted(a, h);
            h /= 3;
        }
        assert isSorted(a);
    }


    public static void main(String[] args) {
        Example a = new Shell();
        a.test();
    }


}
