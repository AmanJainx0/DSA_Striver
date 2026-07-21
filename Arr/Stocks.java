package Striver.Arr;
// best time to buy and sell stocks

public class Stocks {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4, 9 };
        int min = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Max profit is "+profit);
    }
}
