package Striver.recursion;
import java.util.Arrays;

public class Rev_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rev(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void rev(int[] arr, int s, int e){
        if(s>=e)return;
        swap(arr, s, e);
        rev(arr, s+1, e-1);
    }
    static void swap(int[] arr, int s, int e){
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
        return;
    }
    
}