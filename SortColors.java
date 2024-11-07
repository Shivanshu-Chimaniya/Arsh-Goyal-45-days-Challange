import java.util.*;

public class SortColors {

  static class Solution {

    public void sortColors(int[] nums) {
      int z = 0, o = 0, n = nums.length;
      int i = 0;
      while (i < n) {
        if (nums[i] == 0) {
          z++;
        } else if (nums[i] == 1) {
          o++;
        }
        i++;
      }

      i = 0;
      while (i < z) {
        nums[i++] = 0;
      }
      while (i < (z + o)) {
        nums[i++] = 1;
      }
      while (i < n) {
        nums[i++] = 2;
      }

      return;
    }
  }

  public static void printArr(int[] nums) {
    for (int i : nums) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = { 1, 0, 2, 1, 0, 0 };
    printArr(nums);
    sol.sortColors(nums);
    printArr(nums);
  }
}
