import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int start = 0;
        int count = 0;
        int result = 0;
        int sum = arr[start];

        while  ((start < arr.length) && (count < arr.length)) {

            if (sum < m) {

                count++;
                if (count >= arr.length) {
                    break;
                }
                else {
                    sum = sum + arr[count];
                }
            }
            else if (sum > m) {

                sum = sum - arr[start];
                start++;
            }
            else {

                result++;
                start++;
                //추가
                count = start;
                sum = arr[start];
            }
        }

        System.out.println(result);
    }
}