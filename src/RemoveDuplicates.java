public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = {1,1,2};
        System.out.println(RemoveDuplicated(arr));
    }

    //remove duplicates in array in place
    //return unique elements.
    private static int RemoveDuplicated(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 1;  // Index to place the next unique element

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;  // The length of the array with unique elements
    }
}


