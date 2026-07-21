package Striver.Arr;
public class Max_sum {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println();
    }

    // kadanes algorithm
    public static int[] maxSubSum(int[] arr) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
            
        }

        return arr;
    }
}
