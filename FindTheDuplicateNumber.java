import java.util.*;

public class FindTheDuplicateNumber {

  static class Solution {

    public int findDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      for (int i : nums) {
        if (set.contains(i)) return i;
        set.add(i);
      }
      return -1;
    }
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = { 1, 2, 3, 2, 2 };
    System.out.println(sol.findDuplicate(nums));
  }
}
