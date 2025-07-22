package MapPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str="automation";
        Map<Character,Integer> countMap = new LinkedHashMap<>();

        for(char ch:str.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : countMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
