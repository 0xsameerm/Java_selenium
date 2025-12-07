package BinarySearchPrograms;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = {10,8,7,5,4,1};
        int target = 5;
        System.out.println(binarySearch(arr,target));
        System.out.println(binarySearch(arr1,target));
    }

    static int binarySearch(int[] arr,int target){

        if(arr == null || arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start] < arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscending){
                if(target > arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

            else{
                if(target > arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }

        return -1;
    }

}
