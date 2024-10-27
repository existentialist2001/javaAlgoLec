package restudy.string.p0112;

import java.util.Scanner;

public class mySolutionOld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int length = n * 7;
        int count = 0;

        String str = sc.nextLine();
        String biStr = "";

        for (int i = 0; i < length; i++) {

            if (count == 7) {
                int decimal = Integer.parseInt(biStr,2);
                System.out.print((char)decimal);

                biStr = "";
                count = 0;
            }

            char c = str.charAt(i);
            if (c == '#') {
                biStr += 1;
            }
            else {
                biStr += 0;
            }

            count++;
        }

        //마지막 부분 따로 처리
        int decimal = Integer.parseInt(biStr,2);
        System.out.print((char)decimal);
    }
}

/*
나의 기존 풀이와 새 풀이의 차이
마지막 부분이 제대로 처리되지 않아 한번 더 적어줘야했다. 이는 count가 7이되어 이진수를 문자로 변환해야 하는데, for문이 끝나버리기 때문이었다. 때문에 코드의 중복이 발생했다.
그래서 다시 생각해봤을 때, 이진수를 다 만든 다음 그걸 문자로 변환하는게 논리적이라 생각해 순서를 바꿨더니 한번에 해결되었다.
즉 기존 풀이는 순서가 이진수의 문자 변환 -> 이진수로 변환이었는데, 이를 새 풀이에서 이진수로 변환 -> 이진수의 문자 변환으로 순서를 바꾸어서 코드의 중복을 해결하였다.

내 풀이와 강의 풀이의 차이
자바의 내장 함수들을 잘 활용한 강의 풀이가 내 풀이보다 간결한 것 같다.
일일히 if문으로 #인지 *인지를 검사한 내 풀이와 다르게 강의 풀이는 relace 함수를 통해 검사할 필요도 없이 곧바로 이진수로 변환했다.
또한 문자의 개수 * 7번 반복한 내 풀이와 다르게 강의 풀이는 substring 함수를 통해 문자의 개수만큼만 반복했다.
* */