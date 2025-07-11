package BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean primeOrNot(int n){
        if(n<=1){
            return false;
        }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        boolean result = primeOrNot(n);
        if(result){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }

}
