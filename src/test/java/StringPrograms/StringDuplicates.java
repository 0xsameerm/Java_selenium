package StringPrograms;

public class StringDuplicates {

    public static String removeDuplicatesString(String str){
            String result = "";
            for (char c : str.toCharArray()) {
                if (!result.contains(String.valueOf(c)))
                    result += c;
            }
            return result;
        }



    public static void main(String[] args) {
        String str = "automation";
        System.out.println(removeDuplicatesString(str));
    }
}
