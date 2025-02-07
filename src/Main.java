import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        int n = kb.nextInt();
        int k = kb.nextInt();

        int[] sales = new int[n];

        for (int i = 0; i < n; i++) {
            sales[i] = kb.nextInt();
        }

        //전처리, 초기 윈도우 구성
        int lt = 0;
        int rt = lt;
        int temp = 0;

        for (int i = 0; i < k; i++) {
            temp += sales[rt++];
        }
        max = temp;

        while (rt < sales.length) {

            temp -= sales[lt++];
            temp += sales[rt++];
            if (temp > max) max = temp;
        }

        System.out.print(max);
    }
}