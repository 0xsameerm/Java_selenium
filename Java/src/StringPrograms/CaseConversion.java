package StringPrograms;

public class CaseConversion {

    public static void main(String[] args) {
        String str = "MoHamED";
        StringBuilder res = new StringBuilder();

        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                res.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                res.append(Character.toUpperCase(ch));
            } else {
                res.append(ch);
            }
        }
        System.out.println(res.toString());
    }
}
