package solved.hashMapAndTreeSet.p0402;

/*
강의 풀이는 Map 자료구조를 하나만 사용했음
*/

import java.util.HashMap;
import java.util.Scanner;

public class MySol {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String w1 = kb.nextLine();
        String w2 = kb.nextLine();

        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();

        //m1 초기화
        for (char key : w1.toCharArray()) {
            m1.put(key,m1.getOrDefault(key,0) + 1);
        }

        //m2초기화
        for (char key : w2.toCharArray()) {
            m2.put(key,m2.getOrDefault(key,0) + 1);
        }

        int count = 0;
        for (char key : m1.keySet()) {

            if (m2.containsKey(key)) {

                if (m1.get(key).equals(m2.get(key))) {
                    count++;
                }
            }
            else {
                count = -1;
                break;
            }
        }

        //최종 검사
        if (count == m1.size()) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
