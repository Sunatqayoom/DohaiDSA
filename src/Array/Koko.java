package Array;

public class Koko {
    public static void main(String[] args) {
        int arr[] = {3,6,7,11};
        int n = 8;
        System.out.println(minEatingSpeed(arr,n));

    }

    //apply binary search on answers
    //thought process we know the max bananas per hour that koko can eat is the maximum element in the array and the minimum will be 1
    //apply binary search on the range to get the minimum bananas per hour thta koko can eat to finish all bananas
    public static int minEatingSpeed(int[] piles, int h) {

        int low=1;
        int high=findMax(piles);
        while(low<=high) {
            int mid=(low+high)/2;
            int totalH = calculateTotalHours(piles, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }

    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;;
        int n = v.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

}
