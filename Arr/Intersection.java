package Striver.Arr;
import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 3, 4, 5 };
        int[] b = { 2, 3, 4, 4, 5, 6, 6 };
        ArrayList<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                intersection.add(a[i]);
                i++;
                j++;
            }

        }
        System.out.println(intersection);
    }
}
