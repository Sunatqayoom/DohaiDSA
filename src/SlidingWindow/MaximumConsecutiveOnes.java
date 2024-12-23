package SlidingWindow;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int nums[]= {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maxOnes(nums,k));

    }

    //time complexity O(n2)

    public static int maxOnes(int arr[],int k) {
        int n = arr.length;

        int maxl =0;
        for(int i =0;i<n;i++){
            int count = 0;
            for(int j = i;j<n;j++) {
                if(arr[j] == 0) {
                    count++;
                }
                if(count<=k) {
                    int len = j-i+1;
                    maxl = Math.max(maxl,len);
                }
                else {
                    break;
                }
            }


        }
        return maxl;

    }

    // Time complexity: O(n)
    public static int maxOnesSlidindWindow(int arr[], int k) {
        int n = arr.length;
        int left = 0, right = 0;
        int maxLen = 0, zeroCount = 0;

        while (right < n) {
            // Expand the window
            if (arr[right] == 0) {
                zeroCount++;
            }

            // Shrink the window if zeroCount exceeds k
            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update the maximum length
            maxLen = Math.max(maxLen, right - left + 1);

            // Move the right pointer
            right++;
        }

        return maxLen;
    }
}
