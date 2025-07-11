package BasicPrograms;

public class Swap {
    public static void swapNum(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }

    //using third variable
    public static void swapNumTemp(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }

    public static void swapString(String str1,String str2){
        str1=str1+str2;
        str2=str1.substring(0,(str1.length()-str2.length()));
        str1=str1.substring(str2.length());
        System.out.println(str1+" "+str2);
    }
    public static void main(String[] args){
        swapNum(10,20);
        swapNumTemp(100,50);
        swapString("Mohamed","Sameer");
    }
}
