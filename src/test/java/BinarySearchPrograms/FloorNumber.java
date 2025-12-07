package BinarySearchPrograms;

//largest number lesser than or equal to target
public class FloorNumber {

    public static void main(String[] args) {
        int[] arr = {3,6,8,11,15,16,18};
        int target = 17;
        System.out.println(floorNumber(arr,target));
    }

    static int floorNumber(int[] arr, int target){

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
        return end;

    }
}
