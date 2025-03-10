package edu.grinnell.csc207.sortslab;

/**
 * A collection of sorting algorithms over generic arrays.
 */
public class Sorts<T> {

    /* Adapted from the reading */
    public static int binarySearch(int value, int[] arr, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (value < arr[mid]) {
            return binarySearch(value, arr, lo, mid);
        } else if (value > arr[mid]) {
            return binarySearch(value, arr, mid, hi);
        } else {
            return mid;
        }
    }

    public static <T extends Comparable<? super T>> int binarySearchGeneric(T value, T[] arr, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (value.compareTo(arr[mid]) < 0) {
            return binarySearchGeneric(value, arr, lo, mid);
        } else if (value.compareTo(arr[mid]) > 0) {
            return binarySearchGeneric(value, arr, mid, hi);
        } else {
            return mid;
        }
    }

    /**
     * Swaps indices <code>i</code> and <code>j</code> of array
     * <code>arr</code>.
     *
     * @param <T> the carrier type of the array
     * @param arr the array to swap
     * @param i the first index to swap
     * @param j the second index to swap
     */
    public static <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * Sorts the array according to the bubble sort algorithm:
     * <pre>
     * [ unprocessed | i largest elements in order ]
     * </pre>
     *
     * @param <T> the carrier type of the array
     * @param arr the array to sort
     */
    public static <T extends Comparable<? super T>> void bubbleSort(T[] arr) {
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * Sorts the array according to the selection sort algorithm:
     * <pre>
     * [ i smallest elements in order | unprocessed ]
     * </pre>
     *
     * @param <T> the carrier type of the array
     * @param arr the array to sort
     */
    public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int lowestIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[lowestIdx]) < 0) {
                    lowestIdx = j;
                }
            }
            swap(arr, i, lowestIdx);
        }
    }

    /**
     * Cite GARIKAI`` Sorts the array according to the insertion sort algorithm:
     * <pre>
     * [ i elements in order | unprocessed ]
     * </pre>
     *
     * @param <T> the carrier type of the array
     * @param arr the array to sort
     */
    public static <T extends Comparable<? super T>> void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    static <T extends Comparable<? super T>> T[] merge(T[] arr1, T[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;

        T[] mergeArr = (T[]) new Object[l1 + l2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l1 && j < l2) {
            if (arr1[i].compareTo(arr2[j]) < 0) {
                mergeArr[k++] = arr1[i++];
            } else {
                mergeArr[k++] = arr2[j++];
            }

            return mergeArr;
        }
        /**
         * Sorts the array according to the merge sort algorithm:
         * <pre>
         * [ sorted | sorted ] -> [ sorted ]
         * </pre>
         *
         * @param <T> the carrier type of the array
         * @param arr the array to sort
         */
    public static <T extends Comparable<? super T>> void mergeSort(T[] arr) {
        int mid = arr.length / 2;
        for(int i = 0; i < mid; i++) {
            
        } 
    }

    /**
     * Sorts the array according to the quick sort algorithm:
     * <pre>
     * []
     * </pre>
     *
     * @param <T>
     * @param arr
     */
    public static <T extends Comparable<? super T>> void quickSort(T[] arr) {
        // TODO: fill me in!
    }
}
