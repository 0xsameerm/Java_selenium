package StringPrograms;

public class ExpandString {

    public static void main(String[] args) {
        String str="a3b4";
        StringBuilder res = new StringBuilder();

        for(int i=0;i<str.length();i+=2){
            char ch = str.charAt(i);
            int count = str.charAt(i+1)-'0';

            for(int j=0;j<count;j++){
                res.append(ch);
            }
        }
        System.out.println(res.toString());
    }
}
