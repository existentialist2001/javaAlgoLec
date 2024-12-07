import java.util.*;

public class Main {

    public ArrayList<Integer> solution (int n, int[] a, int m, int[] b) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (a[i] == b[j]) {
                    result.add(a[i]);
                    break;
                }
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {

        Main t = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }

        for (int x : t.solution(n,a,m,b)) {
            System.out.print(x + " ");
        }
    }
}
