package ArrayPrograms;

import java.util.Arrays;
//Reverse an array using two pointer approach
public class ReverseArray {
    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    reverse(arr);
    }
}
