package Strings;

public class Shuffle {
    public static void main(String[] args) {

        String name = "codleet";
        int arr[] = {1,0,2,3,4,5,6};
        System.out.println(shuffleWords(name,arr));
    }

    public static String shuffleWords(String s,int[] arr) {
        int n = s.length();
        char num[] = new char[n];
        for(int i =0;i<n;i++) {
            num[arr[i]] = s.charAt(i);
        }
        return new String(num);

    }
}
