package com.basics1;

public class Quick {

    public static void sort(int[] arr){
        sort(arr, 0, arr.length-1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);  //
            sort(arr, p + 1, high); //
        }
    }

    private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = a[lo]; // use the leftmost element for the pivot
        while (true) {
            // find item on lo to swap
            while (a[++i] - v <0) // search lo to hi
                if (i == hi) break;
            // find item on hi to swap    // search hi to lo
            while (v - (a[--j])<0)
                if (j == lo) break;      // redundant; a[lo] acts as a sentinel
            // check if pointers cross
            if (i >= j) break;
            exchange(a, i, j);
        }
        // put partitioning item v at a[j]
        exchange(a, lo, j);
        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
    }

    private static void exchange(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


}
