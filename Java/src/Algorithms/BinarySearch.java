package Algorithms;

public class BinarySearch {

    public static int binarySearch(int[] arr,int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (k > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int k=5;
        int[] arr={1,2,3,4,5};
        System.out.println(binarySearch(arr,k));
    }
}

