package BasicPrograms;

import java.util.Arrays;

public class MoveZeros {

    public static void moveToLeft(int[] arr){
        int index=arr.length-1;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[index--]=arr[i];
            }
        }
        while(index>=0){
            arr[index--]=0;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void moveToRight(int[] arr){
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }

        while(index<arr.length){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,4,0,5};
        moveToLeft(arr);
        System.out.println("--------------------");
        moveToRight(arr);
    }
}
