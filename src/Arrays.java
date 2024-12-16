public class Arrays {



    public static void main(String[] args) {

        int arr[] = {2,4,5,1,2};
        System.out.println(checkSorted(arr));
    }

    //program to check if an array was initially sorted and thne rotated for some value x ,x can be 0 as well
    //check pairwise if any pair i greater increase the count.
    static boolean checkSorted(int[] nums) {

        int n = nums.length;

        int count = 0;

        //check for last and first index because you have to go in cycle
        if(nums[n-1] > nums[0] ) {
            count++;
        }

        for(int i = 0; i<n-1;i++) {

            if(nums[i] < nums[i+1]) {
                count++;
            }
        }
        if(count > 1) {
            return false;
        }
            return true;

    }
}
