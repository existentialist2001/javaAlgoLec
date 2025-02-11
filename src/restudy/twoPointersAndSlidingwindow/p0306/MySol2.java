package restudy.twoPointersAndSlidingwindow.p0306;

import java.util.Scanner;

public class MySol2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int lt = 0;
        int rt = lt;

        int chance = k;
        int max = 0;
        int length = 0;

        while (rt < arr.length) {

            //0일때
            if (arr[rt] == 0) {

                if (chance > 0) {

                    //arr[rt] = 1;
                    rt++;
                    chance--;
                }
                else {

                    length = rt - lt;
                    if (length > max) max = length;

                    lt++;
                    rt = lt;
                    chance = k;
                }
            }

            //1일때
            else {
                rt++;
            }
        }

        System.out.print(max);
    }
}
