package restudy.twoPointersAndSlidingwindow.p0301;

import java.util.ArrayList;
import java.util.Scanner;

//2회독 풀이

public class MySol2 {
    public static void main(String[] args) {

        ArrayList<Integer> result = new ArrayList<>();

       Scanner kb = new Scanner(System.in);

       int n = kb.nextInt();
       ArrayList<Integer> arr1 = new ArrayList<>();

       for (int i = 0; i < n; i++) {
           arr1.add(kb.nextInt());
       }

       int m = kb.nextInt();
       ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            arr2.add(kb.nextInt());
        }

        //
        while(!arr1.isEmpty() && !arr2.isEmpty()) {

            int a = arr1.get(0);
            int b = arr2.get(0);

            if (a <= b) {

                result.add(a);
                arr1.remove(0);
            }
            else {

                result.add(b);
                arr2.remove(0);
            }
        }

        //
        if (!arr1.isEmpty()) {
            for (int i : arr1) result.add(i);
        }

        if (!arr2.isEmpty()) {
            for (int i : arr2) result.add(i);
        }

        //
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}