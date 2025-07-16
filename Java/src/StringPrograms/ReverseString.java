package StringPrograms;

//Reverse a string and sentence using String and StringBuilder
public class ReverseString {
    public static void reverse(String str){
        String res ="";
        for(int i =str.length()-1;i>=0;i--){
            res+=str.charAt(i);
        }
        System.out.println(res);
    }

    public static void reverseSB(String str){
        StringBuilder res =new StringBuilder();
        for(int i =str.length()-1;i>=0;i--){
            res.append(str.charAt(i));
        }
        System.out.println(res);
    }

    public static void reverseWords(String words){
        String word[] =words.split(" ");
        String res="";
        for(int i =word.length-1;i>=0;i--){
            res=res+word[i]+" ";
        }
        System.out.println(res);
    }

    public static void reverseWordsSB(String words){
        String word[] =words.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i =word.length-1;i>=0;i--){
            res.append(word[i]).append(" ");
        }
        System.out.println(res);
    }

    public static void main(String[] args){
        reverse("Mohamed");
        reverseSB("Mohamed");
        reverseWords("I am a Automation tester");
        reverseWordsSB("I am a Automation tester");

    }
}
