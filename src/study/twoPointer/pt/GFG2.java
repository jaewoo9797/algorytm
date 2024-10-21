package study.twoPointer.pt;

import java.util.Arrays;

public class GFG2 {

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        if (twoSum(arr, target)) System.out.println("true");
        else System.out.println("false");
    }

    private static boolean twoSum(int[] arr, int target) {
        // Sort the Array
        Arrays.sort(arr);

        int left = 0, right = arr.length-1;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) left++;
             else right--;
        }
        return false;
    }
}
