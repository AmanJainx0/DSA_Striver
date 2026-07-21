package Striver.recursion;
public class Test_rec {
    public static void main(String[] args) {
        test(0);
    }
    static int count = 0;
    static void test(int count){
        if(count == 5)return;
        System.out.println("Aman Jain");
        test(count+1);
    }
}
