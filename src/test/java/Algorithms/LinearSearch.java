package Algorithms;

public class LinearSearch {

    public static int linearSearch(int arr[], int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args){
        int k=5;
        int[] arr={1,2,3,4,5};
        System.out.println(linearSearch(arr,k));
    }

}
