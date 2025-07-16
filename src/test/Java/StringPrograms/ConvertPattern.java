package StringPrograms;

public class ConvertPattern {

    // Testing -> T$st$$ng
    public static void convert1(String str){
        StringBuilder res = new StringBuilder();
        int count = 1;
        for(char ch:str.toCharArray()){
            if("AEIOUaeiou".indexOf(ch)!=-1){
                res.append("$".repeat(count++));}
            else{
                res.append(ch);
            }
        }
        System.out.println(res);
    }


    public static void main(String[] args) {
        String str="Testing";
        convert1(str);
    }
}
