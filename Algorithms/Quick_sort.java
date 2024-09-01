package Algorithms;

import java.util.Arrays;

public class Quick_sort {

    public static void main(String[] args) {
        int []a= {5,7,8,2,1,6,3,2,8};
        sort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int st, int end) {
        if (st >= end) return;

        int i = st, j = end;
        int pivot = a[(st + end) / 2];
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }     
        sort(a, st, j);
        sort(a, i, end);
    }
}
