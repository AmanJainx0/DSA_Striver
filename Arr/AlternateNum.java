package Striver.Arr;
import java.util.ArrayList;
import java.util.Arrays;

public class AlternateNum {
    public static void main(String[] args) {
        int[] arr = { -1, 2, 3, 4, -3, 1, -4, -6, -2, -9 };
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int ele : arr) {
            if (ele >= 0) {
                pos.add(ele);
            } else {
                neg.add(ele);
            }
        }
        int min = Math.min(pos.size(), neg.size());
        for (int i = 0; i < min; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
        int index = 2 * min;

        if (pos.size() > neg.size()) {
            for (int i = min; i < pos.size(); i++) {
                arr[index++] = pos.get(i);
            }
        } else {
            for (int i = min; i < neg.size(); i++) {
                arr[index++] = neg.get(i);
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
