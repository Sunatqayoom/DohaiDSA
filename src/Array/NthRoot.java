package Array;

public class NthRoot {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        //System.out.println(NthRootOfmLinear(n,m));
        //call binarysearch function
        System.out.println(NthRootOfmLinear(n,m));
    }

    //Time complexity O(n)
    public static int NthRootOfmLinear(int n,int m) {

        for(int i =0;i<m;i++) {
            int power = (int)Math.pow(i,n);
            if(power==m) {
                return i;
            } else if(power> m) {
                return -1;
            }
        }
        return -1;
    }

    //applying binary search
    public static int NthRootBinarySearch(int n,int m) {

        int low = 1;
        int high = m;

        while(low<=high) {
            int mid =  (low+high)/2;
            int power = (int)Math.pow(mid,n);
            if(power==m) {
                return mid;
            }
            else if(power>m) {
                high=mid-1;
            }
            else if(power<m) {
                low=mid+1;
            }
        }
        return -1;
    }
}
