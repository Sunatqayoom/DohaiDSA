package Array;

public class NUmberOfOccurences {
    public static void main(String[] args) {
        int arr[] = {1,1,2,1,3,4};
        int n = arr.length;
        int x = 1;
        System.out.println(count(arr,n,x));

    }
    //linearly do the program.. O(N)
    public static int count(int arr[], int n, int x) {

        int count = 0;
        for(int i = 0;i<n;i++) {
            if(arr[i]==x) {
                count++;
            }
        }
        return count;
    }
}
