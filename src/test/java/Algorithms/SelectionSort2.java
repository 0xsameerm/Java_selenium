package Algorithms;


import java.util.Arrays;

public class SelectionSort2 {

    public static void main(String[] args) {
        int[] arr={10,2,5,4,7,};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for(int i=0;i < arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = findMaxIndex(arr,0,last );
            swap(arr,maxIndex,last);
        }
    }

    private static void swap(int[] arr, int first, int second ) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int findMaxIndex(int[]arr,int start, int last) {
        int maxIndex = start;
        for(int i=start+1;i<=last;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }


}
