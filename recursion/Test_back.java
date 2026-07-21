package Striver.recursion;
public class Test_back {
    public static void main(String[] args) {
        
        test(1,10);
    }
    static void test(int i , int n){
        if(i>n)return;
        test(i+1,n);
        System.out.println(i);
    }

}
