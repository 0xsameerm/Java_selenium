package BasicPrograms;

public class Palindrome {
    public static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeSB(String str){
        String res = new StringBuilder(str).reverse().toString();
        return str.equals(res);
    }

    public static void main(String[] args) {
        String str = "markram";
        System.out.println(isPalindrome(str));
        System.out.println("---------- PalindromeOrNot----------");
        System.out.println(isPalindromeSB(str));
    }
}
