package BasicPrograms;

public class ArmstrongNumber {

    public static void isArmstrong(int number){

        int n = number;
        int rem,result=0;

        while(n!=0){
            rem=n%10;
            result+= Math.pow(rem,3);
            n/=10;
        }

        if(result == number){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        }

    }

    public static void main(String[] args) {
        int input = 371;
        isArmstrong(input);
    }

}
