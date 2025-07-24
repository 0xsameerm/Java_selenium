package ArrayPrograms;

public class SecondMax {

    public static void main(String[] args) {
        int[] arr={1,2,4,5,3};

        int first = arr[0];
        int second = arr[0];

        for(int i : arr){
            if(i>first){
                second=first;
                first=i;
            }
            if(i>second && i!=first){
                second=i;
            }
        }
        System.out.println(second);
    }
}
