import java.util.*;

//무언가를 판단하기 위한 변수는, 사용한 후 계속 초기값으로 초기화 해주어야 함


public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        boolean isDecimal = true;
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {

                    isDecimal = false;
                    break;
                }
            }
            if (isDecimal) {
                //System.out.println("소수: " + i);
                cnt++;
            }
            isDecimal = true;
        }
        System.out.println(cnt);
    }
}
