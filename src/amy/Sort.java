package amy;

import java.util.Arrays;
import java.util.Random;

/**
 *
 */
public class Sort {
    public static void main(String[] args) {
        int[] array = genArr();
        System.out.println(Arrays.toString(array));
        //array = bubbleSort(array);
        //array = selectionSort(array);
        array = insertionSort(array);

        System.out.println(Arrays.toString(array));

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] genArr() {
        int size = 10; // 数组大小
        int min = 10; // 随机数最小值
        int max = 99; // 随机数最大值
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    // 冒泡排序
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // i < arr.length 也可以。 i= arr.length - 1时，第二个for循环判断条件不满足：j < 0。
            System.out.printf("i(%d): j :", i);
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.printf(" - %d", j);

                if (arr[j] > arr[j + 1]) {        //相邻元素两两对比
                    int temp = arr[j + 1];        //元素交换
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println();
        }
        return arr;
    }

    // 选择排序
    public static int[] selectionSort(int[] arr) {
        int len = arr.length;
        int minIndex;
        for (int i = 0; i < len - 1; i++) { // i 应小于len-1, 因为下一个for循环中 j = i + 1, 此处 i < len 也可以。只不过第二个for循环判断条件不满足， 多一次判断。
            System.out.printf("i(%d): j :", i);
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                System.out.printf(" - %d", j);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
            System.out.println();
        }

        return arr;
    }

    // 插入排序
    public static int[] insertionSort(int[] arr) {
        //arr = new int[]{19, 18, 17, 16, 15, 14, 13, 12, 11, 10};
        for (int i = 1; i < arr.length; i++) {
            System.out.printf("i(%d): j :", i);
            int j = i - 1;
            int target = arr[i];
            while (j >= 0 && arr[j] > target   ) {
                return1(j);
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
            System.out.println();
            System.out.printf("target : %d >>", target);
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    // 插入排序
    public static int[] shellSort(int[] arr) {
        return arr;
    }

    public static boolean return1(int j) {
        System.out.printf(" 、%d", j);
        return true;
    }


}

