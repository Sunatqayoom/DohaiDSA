package Array;

public class lowerBound {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3};
        int n = arr.length;
        int target = 0;
        System.out.println(lowerBound(arr,n,target));
    }

    //lowerbound is the smallest index i such that arr[i] >= target element
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] >=x) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }

        }
        return ans;
    }
}