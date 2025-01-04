package solved.hashMapAndTreeSet.p0402;

import java.util.*;

public class LecSol {

    public String solution(String s1, String s2) {

        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x,0) + 1);
        }

        for (char x : s2.toCharArray()) {

            //아예 문자 자체가 없거나, 문자 개수가 0이라면 아나그램이 될 수 없음
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";

            map.put(x,map.get(x) - 1);
        }
        return answer;
    }

    public static void main(String[] args){

        LecSol T = new LecSol();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(T.solution(a, b));
    }
}
