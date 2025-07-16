package Algorithms;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int[] arr){

        for(int i=0;i<arr.length-1; i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                        minindex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr={3,2,5,4,1};
        SelectionSort sel = new SelectionSort();
        sel.selectionSort(arr);
    }
}

