package BasicPrograms;

public class Recursion {

    //1.print 1 to 100 without uisng loop
    public static void print(int n){

        if(n>100){
            return;
        }
        System.out.println(n);
        n++;
        print(n);
    }

    //2.Factorial
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }


    public static void main(String[] args) {
        //print(1);
        System.out.println(factorial(5));
    }
}
