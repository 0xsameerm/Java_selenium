package BasicPrograms;

public class SumAndCountOfDigits {
    public static int digitsSum(int n){
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

    public static void digitsCount(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println("Number of digits is "+count);
    }

    public static void main(String[] args){
        int n=1234;
        System.out.println("Sum of digits is "+digitsSum(n));
        digitsCount(n);
    }

}
