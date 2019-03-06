package interviewpreparationkit.warmup_challenges.repeated_string;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        long n = sc.nextLong();

        long mod = n % s.length();
        long aCount = 0;
        long cutStringACount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                aCount++;
            if (s.charAt(i) == 'a' && i < mod)
                cutStringACount++;

        }

        long result;

        result = aCount * (n / s.length());

        System.out.println(result + cutStringACount);

    }

}
