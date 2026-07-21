package Striver.Arr;
import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zeros {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        // move0(arr);
        move(arr);

    }

    // brute force using temp array
    public static void move0(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        for (int i = list.size(); i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    // optimal solution
    public static void move(int[] arr) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }

    // 3936. Minimum Swaps to Move Zeros to End
    public static void minimumSwaps(int[] arr){
        int i = 0;
        int j = arr.length-1;
        int count = 0;
        while(i<j ){
            if(arr[i] == 0 && arr[j] != 0){
                swap(arr, i, j);
                count++;
            }
            i++;
            j--;
        }
        System.out.println(count);
    }

}
