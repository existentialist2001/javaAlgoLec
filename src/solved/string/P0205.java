package solved.string;

import java.util.Scanner;

public class P0205 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        if (n == 2) {
            count = 1;
        }

        if (n == 3) {
            count = 2;
        }

        //
        if (n > 3) {
            count = 2;
            for (int i = 4; i < n + 1; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        }

        private static boolean isPrime(int num) {

            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }