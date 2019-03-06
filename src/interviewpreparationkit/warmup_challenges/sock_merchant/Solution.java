/*
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */

package interviewpreparationkit.warmupchallenges.sock_merchant;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();

        }

        System.out.println(pairs(ar));

    }

    private static int pairs(int[] ar) {

        int[] colors = new int[ar.length];
        int[] quantity = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            int v = existsInArray(colors, ar[i]);
            if (v == -1) {
                colors[i] = ar[i];
                quantity[i]++;
            } else {
                quantity[v]++;
            }

        }

        int pairs = 0;

        for (int i : quantity) {
            pairs += i / 2;
        }

        return pairs;
    }

    private static int existsInArray(int[] ar, int n) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == n) return i;
        }
        return -1;
    }

}
