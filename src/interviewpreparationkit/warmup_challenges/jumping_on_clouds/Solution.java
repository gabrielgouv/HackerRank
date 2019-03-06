/*
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
 */

package interviewpreparationkit.warmupchallenges.jumping_on_clouds;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int jumps = 0;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();

            if (c == 0) {
                counter++;
            } else {
                counter = 0;
                jumps++;
            }

            if (counter == 2) {
                counter = 0;
                jumps++;
            }

        }

        System.out.println(jumps);

    }

}
