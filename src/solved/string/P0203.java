package solved.string;

import java.util.Scanner;

//나름 최대한 조건문 적게 쓰려고 했는데.. 이 방법 밖에 없나..?
//강의는 나보다 좀 더 컴팩트하게 품, 1. 비기는 경우 2. A가 이기는 경우 3. A가 지는 경우
//코드 치기 전에, 예시를 좀 더 철저하게 분석하고 들어가자.

public class P0203 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] aInfo = new int[n];
        int[] bInfo = new int[n];

        for (int i = 0; i < n; i++) {
            aInfo[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bInfo[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            if (aInfo[i] == bInfo[i]) {
                System.out.println("D");
            }

            else {

                if (aInfo[i] == 1) {

                    if (bInfo[i] == 2) {
                        System.out.println("B");
                    }
                    else {
                        System.out.println("A");
                    }
                }

                else if (aInfo[i] == 2) {

                    if (bInfo[i] == 3) {
                        System.out.println("B");
                    }
                    else {
                        System.out.println("A");
                    }
                }

                else if (aInfo[i] == 3) {

                    if (bInfo[i] == 1) {
                        System.out.println("B");
                    }
                    else {
                        System.out.println("A");
                    }
                }
            }
        }
        }
    }