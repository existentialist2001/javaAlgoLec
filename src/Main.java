import java.util.*;

//Array 파트니까 배열 사용?
//여전히 좀 더러움

/*
String str = "abc";
int num = Integer.parseInt(str);
이거 런타임 에러남, Integer.parseInt 함수는 "123"같은 숫자 문자열만 변환할 수 있음

Integer.reverse 함수는 숫자의 비트를 뒤집는 함수이지, 숫자를 뒤집는 함수가 아님
*/

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        for (int i = 0; i < n; i++) {

            int num = kb.nextInt();
            String temp = new StringBuilder(String.valueOf(num)).reverse().toString();
            int reversedNum = Integer.parseInt(temp);
            if ((reversedNum > 1) && (isDecimal(reversedNum))) {
                System.out.print(reversedNum + " ");
            }
        }
    }

    private static boolean isDecimal(int reversedNum) {

        for (int i = 2; i <= Math.sqrt(reversedNum); i++) {

            if ((reversedNum % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
