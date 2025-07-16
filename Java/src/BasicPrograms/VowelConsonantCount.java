package BasicPrograms;

public class VowelConsonantCount {

    public static void main(String[] args) {
        String str = "automation";
        int vowels=0;
        int consonants=0;
        for(char ch:str.toCharArray()){
            if(ch>='a' && ch<='z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("vowels count: "+vowels);
        System.out.println("Consonants count: "+consonants);
    }
}
