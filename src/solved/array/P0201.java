package solved.array;

import java.util.Scanner;

//입력과 처리에 있어 배열을 사용하니까 배열 챕터인 듯..?

public class P0201 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int prev = Integer.MIN_VALUE;
        int n = sc.nextInt();
        sc.nextLine();
        int[] ints = new int[n];

        for (int i = 0; i < n; i++) {
            ints[i] = sc.nextInt();
        }

        for (int i : ints) {

            if (i > prev) {
                System.out.print(i + " ");
            }

            prev = i;
        }
    }
}