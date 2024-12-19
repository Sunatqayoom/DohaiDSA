package Array;

public class NthRoot {
    public static void main(String[] args) {
        int n = 3;
        int m = 81;
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
}
