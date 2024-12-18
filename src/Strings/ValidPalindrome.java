package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(checkPlaindrome(s));
        String ab = "ab_a";
        System.out.println(checkPlaindrome(ab));
    }

    //Check if a given string is palindroom or not  after converting all uppercase letters into lowercase letters and removing all non-alphanumeric character
    public static Boolean checkPlaindrome(String str)
    {
        str=str.toLowerCase();
        str= str.replace("[^a-zA-Z0-9]","");

        int start = 0;
        int last = str.length()-1;

        while(start<=last) {

            char currFirst = str.charAt(start);
            char currLast = str.charAt(last);
            if(currLast!=currLast) {
                return false;
            }
            start++;
            last--;
        }

        return true;
    }
}
