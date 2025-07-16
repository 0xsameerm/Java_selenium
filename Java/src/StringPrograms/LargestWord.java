package StringPrograms;

public class LargestWord {

    public static void main(String[] args) {
        String sentence = "Trust the process without worrying about the result";
        String max="";
        String[] words = sentence.split(" ");
        for(String word:words){
            if(word.length()>max.length()){
                max=word;
            }
        }
        System.out.println(max);
    }
}
