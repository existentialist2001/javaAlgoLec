package restudy.array.p0206;

import java.util.Scanner;

/*풀면서 내 풀이가 너무 지저분하다고 생각했다.
강의는,
1)내 풀이처럼 String, StringBuilder를 사용하지 않고 int만으로 숫자를 뒤집었고,
2)소수 판별에 있어 에라토스테네스 체를 사용할 줄 알았는데 그냥 자기 전까지의 수들로 나누어 판별했다.
그도 그럴 것이, 에라토스테네스 체는 특정 숫자 하나의 소수 판별이 아닌, 연속된 숫자들 속에서 소수를 골라내는 방법이다.

특히 강의의 숫자 뒤집는 방법 기억하자.
*/

/*
2회독
String str = "abc";
int num = Integer.parseInt(str);
이거 런타임 에러남, Integer.parseInt 함수는 "123"같은 숫자 문자열만 변환할 수 있음

Integer.reverse 함수는 숫자의 비트를 뒤집는 함수이지, 숫자를 뒤집는 함수가 아님

숫자 뒤집는 거 직접 해봄, 핵심은 10으로 나누는 것
*/

public class MySolution {
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

            if ((reversedNum > 1) && isPrime(reversedNum)) {
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