package Striver.recursion;
import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int n = 4;
        ArrayList<Integer> list = new ArrayList<>();
        sub(0, list, arr, n);

    }
    static  void sub(int ind, ArrayList<Integer> list, int[] arr, int n){
        if(ind >= n){
            for(int i: list){
                System.out.print(i+" ");
            }
            if(list.size()==0 ){
                System.out.print("{}");
            }
            System.out.println();
            return;
        }
        list.add(arr[ind]);
        sub(ind+1, list, arr, n);//taking the current index
        list.remove(list.size() - 1);
        sub(ind+1, list, arr, n);// not taking the current index
    }
}
