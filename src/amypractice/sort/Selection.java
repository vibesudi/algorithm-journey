package amypractice.sort;

/**
 *
 */
public class Selection extends Example {

    @Override
    void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[minIndex])) {
                    minIndex = j;
                }
            }

            exch(a, i, minIndex);
        }
    }

    public static void main(String[] args) {
        Example a = new Selection();
        a.test();
    }
}
