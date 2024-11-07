package solved.string;

import java.util.Scanner;

//너무 지저분하게 풀었는데..

public class P0206 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] numbers = new String[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = String.valueOf(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {

            StringBuilder reversedStr = new StringBuilder(numbers[i]).reverse();
            Integer reversedNum = Integer.valueOf(reversedStr.toString());

            if ((reversedNum > 1) & isPrime(reversedNum)) {
                System.out.print(reversedNum + " ");
            }
        }
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