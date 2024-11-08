package solved.string;

import java.util.Scanner;

public class P0207 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];

        int count = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        for (int s : scores) {

            if (s == 1) {
                count++;
                total += count;
            }
            else {
                count = 0;
            }
        }
        System.out.println(total);
    }
    }