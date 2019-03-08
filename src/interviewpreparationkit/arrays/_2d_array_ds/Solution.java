/*
 * https://www.hackerrank.com/challenges/2d-array/problem
 */

package interviewpreparationkit.arrays._2d_array_ds;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[6][6];

        for (int l = 0; l < 6; l++) {

            String[] inputArr = sc.nextLine().split(" ");

            for (int c = 0; c < 6; c++) {
                mat[l][c] = Integer.parseInt(inputArr[c]);
            }

        }

        System.out.println(hourglassSum(mat));

    }

    private static int hourglassSum(int[][] mat) {

        int maxSum = Integer.MIN_VALUE;

        for (int l = 0; l < mat.length - 2; l++) {
            for (int c = 0; c < mat.length - 2; c++) {
                int topSum = mat[l][c] + mat[l][c + 1] + mat[l][c + 2];
                int midSum = mat[l + 1][c + 1];
                int bottomSum = mat[l + 2][c] + mat[l + 2][c + 1] + mat[l + 2][c + 2];
                int sum = topSum + midSum + bottomSum;

                if (sum > maxSum)
                    maxSum = sum;

            }
        }

        return maxSum;
    }

}
