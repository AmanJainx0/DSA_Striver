package Striver.recursion;
import java.util.ArrayList;

public class Sum_Subsequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        sum(0, sum, list, 0, arr, n);
    }
    static void sum(int ind,int sum, ArrayList<Integer> list, int s, int[] arr, int n){
        if(ind >= n){
            if(s == sum){
                for(int i: list){
                    System.out.print(i+" ");
                }
                System.out.println();

            }
            return;
        }
        list.add(arr[ind]);
        s+=arr[ind];
        sum(ind+1, sum, list, s, arr, n);
        list.remove(list.size()-1);
        s-=arr[ind];
        sum(ind+1, sum, list, s, arr, n);
    }
}
