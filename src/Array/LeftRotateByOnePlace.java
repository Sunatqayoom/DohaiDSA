package Array;

public class LeftRotateByOnePlace {

    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 5, 6};
        nums = leftRotate(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    //left rortate an array by one place
    public static int[] leftRotate(int[] arr) {
        int n = arr.length;

        int temp = arr[0];

        for(int i = 1;i<n;i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
}
