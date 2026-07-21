package Striver.Arr;
public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 5, 6, 7 };
        int n = nums.length;
        // int actual = n * (n+1)/2;
        // int exp = 0;
        // for(int i = 0;i<n;i++){
        // exp += nums[i];
        // }
        // int ans = actual-exp;
        // System.out.println(ans);

        // xor method
        
        int xor1 =0;
        int xor2 = 0;

        for(int i = 0;i<n;i++){
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i+1);
        }
        
        System.out.println(xor1^xor2);
    }

}