package Sorting_algorithm;
import java.util.*;
public class Two_array_sorting

 {
    public static void main(String[] args) {
        int arr[] = {10, 40, 50, 80, 90};
        int arr1[] = {20, 30, 60};
        int res[] = new int[arr.length + arr1.length];

        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                res[k] = arr[i];
                k++;
                i++;
            } else {
                res[k] = arr1[j];
                k++;
                j++;
            }
        }

        while (i < arr.length) {
            res[k] = arr[i];
            k++;
            i++;
        }

        while (j < arr1.length) {
            res[k] = arr1[j];
            k++;
            j++;
        }

        System.out.println(Arrays.toString(res));
    }
}
