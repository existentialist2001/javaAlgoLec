package restudy.hashMapAndTreeSet.p0404;

import java.util.*;

/*
equals 함수, 주소 비교가 아닌 논리 비교
map에도 사용할 수 있다는 것 배웠지만, 떠올리지 못했다.
기본기 = 실력 = 본질

슬라이딩 윈도우 알고리즘
늘 초기 윈도우 구성 작업이 필요
*/

public class LecSol {

    public int solution(String a, String b) {

        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        //map 초기화
        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);

        //초기 윈도우 구성 작업
        int L = b.length() - 1;
        for (int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);

        //슬라이딩 윈도우 시작
        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {

            //오른쪽
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);

            //오른쪽 이동 후 검사
            if (am.equals(bm)) answer++;

            //왼쪽
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
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