package MapPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {

    public static void characterCount(String str){
        Map<Character,Integer> countMap = new HashMap<>();
        for(char ch:str.toCharArray()){
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
        }
        countMap.forEach((K,V) -> System.out.println(K+":"+V));
    }

    public static void wordCount(String sentence){
        String[] words = sentence.split(" ");
        Map<String,Integer> countMap = new LinkedHashMap<>();
        for(String word:words){
            countMap.put(word,countMap.getOrDefault(word,0)+1);
        }
        countMap.forEach((K,V) -> System.out.println(K+":"+V));
    }
    public static void main(String[] args) {
        String str = "abracadabra";
        String sentence = "This could be today, Gramdma!";
        characterCount(str);
        System.out.println("---------------------");
        wordCount(sentence);
    }
}
