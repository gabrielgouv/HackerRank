/*
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */

package interviewpreparationkit.warmupchallenges.counting_valleys;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = sc.nextLine();

        int valleysCount = countValleys(n, s);

        System.out.println(valleysCount);

    }

    private static int countValleys(int n, String s) {

        int valleysCount = 0;
        int seaLevel = 0;
        int level = 0;
        boolean calculatingValley = false;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                level--;
                if (level < seaLevel)
                    calculatingValley = true;
            } else if (s.charAt(i) == 'U') {
                level++;
            }
            if (level >= seaLevel && calculatingValley) {
                calculatingValley = false;
                valleysCount++;
            }
        }

        return valleysCount;

    }

}
