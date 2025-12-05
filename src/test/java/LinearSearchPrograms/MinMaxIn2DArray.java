package LinearSearchPrograms;

public class MinMaxIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {1,5,9},
                {10,34,55,63},
                {88,100}
        };
        System.out.println(maxvalue(arr));
        System.out.println(minvalue(arr));
    }

    static int maxvalue(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    static int minvalue(int[][] arr){
        int min = Integer.MAX_VALUE;

        for(int[] arrs : arr){
            for(int element:arrs){
                if(element < min ){
                   min  = element;
                }
            }
        }
        return min;
    }

}
