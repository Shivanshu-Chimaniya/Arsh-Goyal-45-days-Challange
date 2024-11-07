import java.util.*;

public class MoveZeros {

  static class Solution {

    public void moveZeroes(int[] nums) {
      int low = 0, high = 0;
      while (high < nums.length) {
        if (nums[high] != 0) {
          nums[low] = nums[high];
          low++;
        }
        high++;
      }
      while (low < nums.length) nums[low++] = 0;
    }
  }

  public static void printArr(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = { 0, 1, 0, 3, 12 };
    printArr(nums);
    sol.moveZeroes(nums);
    printArr(nums);
  }
}
