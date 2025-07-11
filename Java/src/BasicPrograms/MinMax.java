package BasicPrograms;

public class MinMax {
    public static void minNumber(int[] array){
        int min = array[0];
        for(int num:array){
            if(min>num){
                min=num;
            }
        }
        System.out.println(min);
    }

    public static void maxNumber(int[] array){
        int max = array[0];
        for(int num:array){
            if(max<num){
                max=num;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int[] array =new int[]{1,2,3,4,5};
        minNumber(array);
        maxNumber(array);
    }

}
