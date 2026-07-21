package Striver.recursion;
public class Pal_String {
    public static void main(String[] args) {
        String a = "ankit";
        System.out.println(check(a,0));


    }
    static boolean check(String str, int i){
        if(i >= str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        return check(str, i + 1);
    }
}
