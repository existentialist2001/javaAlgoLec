package restudy.array.p0205;

import java.util.Scanner;

//소수 구하는 방법 스스로 못떠올려서, 검색함.
//강의 풀이 확인하기.
//제곱근과 이중 for문을 사용한 내 풀이방식은 시간제한에 걸릴 수도 있다고 함, 에라토스테네스 체라는 강의 풀이 방식 기억하기.

public class MySolution {
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