package Array;

public class ReversePairs {
    public static void main(String[] args) {

    }

    //Given an integer array nums, return the number of reverse pairs in the array.
    //A reverse pair is a pair (i, j) where:
    //
    //**0 <= i < j < nums.length and
    //**nums[i] > 2 * nums[j].
 //Brute force
    //Time limited exceeded in htis case
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i =0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(nums[i] > 2L*nums[j]) { //2L for large numbers
                    count++;
                }
            }
        }
        return count;
    }

    //optinmal code
}

