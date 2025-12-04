package LinearSearchPrograms;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr ={1,2,5,7,8,9};
        int target = 9;
        System.out.println(linearsearch(arr,target,2,5));
    }

    static int linearsearch(int[] arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;
        }

        for(int i=start;i<=end;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
