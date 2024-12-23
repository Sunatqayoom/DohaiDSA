package SlidingWindow;

import java.util.HashMap;
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
            //because by using set we can include duplicate values in a single term as set does not include duplicate values..size of the set will not increae  by duplicate values
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

    // Sliding window approach: O(n) time complexity
    public static int maxFruits(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer, Integer> basket = new HashMap<>();
        int start = 0, maxFruits = 0;

        for (int end = 0; end < n; end++) {
            // Add the current fruit to the basket
            basket.put(fruits[end], basket.getOrDefault(fruits[end], 0) + 1);

            // If there are more than 2 distinct fruit types, shrink the window
            while (basket.size() > 2) {
                basket.put(fruits[start], basket.get(fruits[start]) - 1);

                // Remove fruit type from the basket if its count becomes 0
                if (basket.get(fruits[start]) == 0) {
                    basket.remove(fruits[start]);
                }

                start++; // Shrink the window from the left
            }

            // Update the maximum length of a valid window
            maxFruits = Math.max(maxFruits, end - start + 1);
        }

        return maxFruits;
    }
}

