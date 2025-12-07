package BinarySearchPrograms;

//Smallest number greater than or equal to target
public class CielingNumber {

    public static void main(String[] args) {
        int[] arr = {3,6,8,11,15,16,18};
        int target = 17;
        System.out.println(ceiling(arr,target));
    }

    static int ceiling(int[] arr, int target){
        if(target>arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }

}
