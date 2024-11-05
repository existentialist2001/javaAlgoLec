package solved.string;

import java.util.Scanner;

public class P0202 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int visible = 0;
        int max = Integer.MIN_VALUE;

        int n = sc.nextInt();
        sc.nextLine();
        int[] students = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }

        for (int s : students) {

            if (s > max) {

                visible++;
                max = s;
            }
        }

        System.out.println(visible);
        }
    }