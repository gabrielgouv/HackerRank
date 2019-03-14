/*
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */

package interviewpreparationkit.arrays.arrays_left_rotation;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(rotLeft(arr, r))
                .replaceAll(",", "")
                .replaceAll("\\[", "")
                .replaceAll("]", ""));

    }

    private static int[] rotLeft(int[] arr, int r) {

        int aux = arr[0];

        System.arraycopy(arr, 1, arr, 0, arr.length - 1);

        arr[arr.length - 1] = aux;

        if (r > 1)
            arr = rotLeft(arr, r - 1);

        return arr;

    }

}
