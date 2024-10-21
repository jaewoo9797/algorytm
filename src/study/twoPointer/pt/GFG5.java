package study.twoPointer.pt;

public class GFG5 {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int m = arr1.length;
        int n = arr2.length;
        int x = 38;

        for (int i = 0; i<m; i++) {
            int index = binarySearch(arr2, 0, n-1, x-arr1[i]);

            if (index >= 0 && index <n && Math.abs(arr1[i] + arr2[index] -x) < Math.abs(arr1[i] + arr2[index] -x)) {
                printCloset(arr1, arr2, m, n, x);
                return;
            } else if (index > 0 && Math.abs(arr1[i]+arr2[index-1]-x) < Math.abs(arr1[i]+arr2[index]-x)) {
                index--;
            }
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (left > right) return left-1;
        int mid = (left + right) / 2;
        if (arr[mid] == x) return mid;
        // 이진 탐색
        else if (arr[mid] > x) return binarySearch(arr, left, mid-1, x);
        else return binarySearch(arr, mid+1, right, x);
    }
    public static void printCloset(int[] arr1, int[] arr2, int m, int n, int x) {
        int diff = Integer.MAX_VALUE;

        int res_l = 0, res_r = 0;

        int l=0, r=n-1;
        while (l < m && r >= 0) {
            // If this pair is closer to x than the previously
            // found closest, then update res_l, res_r and diff
            if (Math.abs(arr1[l] + arr2[r] - x) < diff) {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr1[l] + arr2[r] - x);
            }

            // If sum of this pair is more than x, move to smaller
            // side
            if (arr1[l] + arr2[r] > x)
                r--;
            else // move to the greater side
                l++;
        }
        System.out.println("The closest pair is [" + arr1[res_l] + ", " + arr2[res_r] + "]");
    }
}
