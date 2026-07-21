package Striver.hashing;
public class H1 {
    public static void main(String[] args) {
        // int[] arr = { 1, 3, 2, 1, 3, 12 };
        // int n = 6;
        // int[] hash = new int[13];
        // for (int i = 0; i < n; i++) {
        //     hash[arr[i]] += 1;
        // }
        // for (int i = 0; i < hash.length; i++) {
        //     if (hash[i] > 0) {
        //         System.out.println(i + " - " + hash[i]);
        //     }
        // }


        String str = "abjrdjcbdsa";
        int s = 11;
        int[] hash = new int[26];
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            hash[ch - 'a']++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println((char)(i + 'a')+" - "+hash[i]);
            }
        }

    }
}
