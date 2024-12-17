package Array;

import java.util.ArrayList;

public class MoveZeroes {

    // Brute Force Approach (Using ArrayList)
    public static void moveZeroesBruteForce(int[] nums) {
        // Create a new ArrayList to store non-zero elements
        ArrayList<Integer> arr = new ArrayList<>();

        // Add all non-zero elements from nums to the ArrayList
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr.add(nums[i]);
            }
        }

        // Fill the remaining space in the ArrayList with zeros
        while (arr.size() < nums.length) {
            arr.add(0);
        }

        // Copy the contents of the ArrayList back to the nums array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
    }

    // Optimal In-Place Approach
    public static void moveZeroesOptimal(int[] nums) {
        int index = 0; // Index to place the next non-zero element

        // Move all non-zero elements to the front of nums
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the rest of nums with zeros
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Utility function to print an array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test both approaches
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] nums2 = {0, 1, 0, 3, 12};

        System.out.println("Original Array:");
        printArray(nums1);

        // Test brute force approach
        System.out.println("Brute Force Approach:");
        moveZeroesBruteForce(nums1);
        printArray(nums1);

        // Test optimal approach
        System.out.println("Optimal Approach:");
        moveZeroesOptimal(nums2);
        printArray(nums2);
    }
}
