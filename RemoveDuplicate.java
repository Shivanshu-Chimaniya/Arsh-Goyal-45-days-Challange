import java.util.*;

public class RemoveDuplicate {

  static class Solution {

    public int removeDuplicates(int[] arr) {
      int i = 0, j = 0, n = arr.length;
      while (i < n) {
        int curr = arr[i];
        arr[j] = curr;

        while (i < n && arr[i] == curr) i++;
        j++;
      }
      return j;
    }
  }

  public static void printArr(int[] nums, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3 };
    printArr(nums, nums.length);
    int i = sol.removeDuplicates(nums);
    printArr(nums, i);
  }
}
