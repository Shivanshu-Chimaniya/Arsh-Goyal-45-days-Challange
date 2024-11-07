import java.util.*;

public class SetMatrixZeros {

  static class Solution {

    public void setZeroes(int[][] matrix) {
      int n = matrix[0].length, m = matrix.length;
      boolean[] row = new boolean[m]; // 3
      boolean[] col = new boolean[n]; // 4

      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (matrix[i][j] == 0) {
            row[i] = true;
            col[j] = true;
          }
        }
      }

      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (row[i] || col[j]) {
            matrix[i][j] = 0;
          }
        }
      }
    }
  }

  public static void printArr(int[][] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        System.out.print(nums[i][j] + " ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[][] m = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
    printArr(m);
    sol.setZeroes(m);
    printArr(m);
  }
}
