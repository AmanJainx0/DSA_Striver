package Striver.Arr;
import java.util.ArrayList;
import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6, 6 };
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.getLast() != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;

            }
        }
        while (j < arr2.length) {
            if (union.size() == 0 || union.getLast() != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        while (i < arr1.length) {
            if (union.size() == 0 || union.getLast() != arr1[i]) {
                union.add(arr1[i]);

            }
            i++;
        }

        System.out.println(union);
    }
}
