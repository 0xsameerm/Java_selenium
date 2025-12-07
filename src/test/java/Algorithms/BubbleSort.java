package Algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static String bubbleSort(int arr[]){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
    int[] arr={3,2,5,4,1};
    System.out.println(bubbleSort(arr));
    }
}
