package BasicPrograms;

import java.util.Arrays;

public class Anagram {

    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {

        String str1 = "Evil";
        String str2 = "vile";
        System.out.println(anagram(str1,str2));
    }
}
