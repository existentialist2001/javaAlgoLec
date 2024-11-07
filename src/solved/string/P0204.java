package solved.string;

import java.util.Scanner;

public class P0204 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prev = 0;
        int current = 1;
        int next = 0;

        System.out.print(current + " ");

        for (int i = 0; i < n - 1; i++) {

            next = prev + current;

            System.out.print(next + " ");

            prev = current;
            current = next;
        }
    }
}