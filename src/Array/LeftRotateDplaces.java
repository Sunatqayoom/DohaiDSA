package Array;

public class LeftRotateDplaces {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        //nums = rotate(nums, 3);
        int d = 3;
        reverse(nums, 0, d - 1); // Reverse the first d elements
        reverse(nums, d, nums.length - 1); // Reverse the remaining elements
        reverse(nums, 0, nums.length - 1); // Reverse the entire array

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

    //brute force:
    //store the first d element in a temp array and then add remainifn in the array
    //at last shift back the temp element to the end of the array
    static int[] rotate(int[] arr, int d) {

        int n = arr.length;
        d = d % n;


        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        int j = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
        return arr;
    }

    //OPTIMAL APPROACH
    // e.g arr = {1,2,3,4,5,6,7} .. reverse 0,n-d+1 = {3,2,1} now reverse n-k,n-1= 7,6,5,4 now revere 0,n-1 =4,5,6,7,3,2,1 give the result we want


    public static void reverse(int[] arr, int start,int end) {

        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
