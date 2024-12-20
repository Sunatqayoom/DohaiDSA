package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Triangle {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(7);
        arr.add(1);
        arr.add(5);
        int n = arr.size();
        System.out.println(maxPerimeterTriangle(arr,n));

    }
    public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
        Collections.sort(arr);

        // Traverse the array from the third last element to the first
        for (int i = n - 1; i >= 2; i--) {
            // Check if arr[i-2], arr[i-1], arr[i] form a valid triangle
            if (arr.get(i-2) + arr.get(i-1) > arr.get(i)) {
                // Return the perimeter of the valid triangle
                return arr.get(i-2) + arr.get(i-1) + arr.get(i);
            }
        }

        // If no valid triangle can be formed, return 0
        return 0;
    }
}
