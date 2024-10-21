package study.twoPointer.pt;

public class GFG4 {
    void printCloset(int[] ar1, int[] ar2, int m, int n, int x) {
        int diff = Integer.MAX_VALUE;

        int res_l = 0, res_r = 0;

        int l=0, r=n-1;

        while (l<m && r>=0) {
            if(Math.abs(ar1[l] + ar2[r] - x) < diff) {
                res_l = l;
                res_r = r;
                diff = Math.abs(ar1[l] + ar2[r] - x);
            }

            if (ar1[l] + ar2[r] > x) r--;
            else l++;
        }
        System.out.println("The closet pair is [" + ar1[res_l] + ", " + ar2[res_r] + "]");
    }
    public static void main(String[] args) {
        GFG4 g = new GFG4();
        int[] ar1 = {1, 4, 5, 7};
        int[] ar2 = {10, 20, 30, 40};

        int m = ar1.length;
        int n = ar2.length;
        int x = 38;
        g.printCloset(ar1, ar2, m,n,x);
    }
}
