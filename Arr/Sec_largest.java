package Striver.Arr;
public class Sec_largest {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 6, 78, 54, 80, 69 };
        int largest = arr[0];
        int sec_largest = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sec_largest) {
                sec_largest = arr[i];

            }
        }
        System.out.println(sec_largest);
    }
}
