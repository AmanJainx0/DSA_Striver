package Striver.Arr;
public class Large_ele {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 78, 54, 80, 69};
        int largest = arr[0];
        for(int i = 1; i<arr.length-1; i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        System.out.println("largest element in the array is "+largest);
    }
}
