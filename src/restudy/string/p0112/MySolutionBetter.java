package restudy.string.p0112;

import java.util.Scanner;

public class MySolutionBetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int length = n * 7;
        int count = 0;

        String str = sc.nextLine();
        String biStr = "";

        for (int i = 0; i < length; i++) {

            char c = str.charAt(i);
            if (c == '#') {
                biStr += 1;
            }
            else {
                biStr += 0;
            }

            count++;

            if (count == 7) {
                int decimal = Integer.parseInt(biStr,2);
                System.out.print((char)decimal);

                biStr = "";
                count = 0;
            }
        }
    }
}