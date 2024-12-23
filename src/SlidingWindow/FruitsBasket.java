package SlidingWindow;

import java.util.HashSet;

public class FruitsBasket {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.println(maxFruitsBruteForce(fruits)); // Output: 4
    }

    // Brute force approach: O(n^2) time complexity
    public static int maxFruitsBruteForce(int[] fruits) {
        int n = fruits.length;
        int maxFruits = 0;

        // Iterate over all possible starting points of subarrays
        for (int i = 0; i < n; i++) {
            HashSet<Integer> basket = new HashSet<>();
            int count = 0;

            // Expand subarray from index `i`
            for (int j = i; j < n; j++) {
                basket.add(fruits[j]); // Add the fruit type to the basket
                if (basket.size() > 2) {
                    // Stop if there are more than 2 distinct fruit types
                    break;
                }
                count++; // Count the current subarray length
            }

            // Update the maximum number of fruits collected
            maxFruits = Math.max(maxFruits, count);
        }

        return maxFruits;
    }
}

