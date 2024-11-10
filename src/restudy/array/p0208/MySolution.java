package restudy.array.p0208;

import java.util.*;

/*
이차원 배열 생성해서 해보다가, 안되어서 다른 자바 강의에서 배운
TreeSet과 ArrayList 사용해서 접근,
TreeSet은 중복제거 뿐만 아니라 정렬까지 해줌,
ArrayList의 요소에 접근할 때는 기존 배열처럼 [i]가 아니라 get(i)로 해야하고, 길이를 구할 때도 length()가 아니라 size()임, 전부 배워서 알고 있다고 생각했지만
실제로 쓰려고 하니 전혀 달랐다.
그리고 밑에 주석처리한 reversed 함수 사용한 두 줄 내 ide에서는 괜찮은데 채첨 사이트에서는 계속 컴파일 에러 나길래 Collection.reverse 함수를 사용해줬음.
근데 일단 틀렸다 ㅋㅋ (같은 등수인 경우까지 고려해줬는데 왜지..?)

틀린 이유는, 문제 제대로 안읽어서 문제 조건 제대로 파악 못함,
강의는
배열의 인덱스와 데이터가 같은 것을 그대로 이용해주었고, 그 결과 또한 인덱스와 데이터가 같은 배열에 저장했음.
이 방법 기억하기.
*/

public class MySolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            scores.add(sc.nextInt());
        }

        //TreeSet 자료 형이라, 자동적으로 중복제거와 정렬이 됨
        Set<Integer> set = new TreeSet<>(scores);

        List<Integer> list = new ArrayList<>(set);
        Collections.reverse(list);
        //밑 두개로 하면 채점에서 컴파일 에러남;
        //List<Integer> reversedList = list.reversed();
        //List<Integer> reversedList = new ArrayList<>(list.reversed());

        int count = 0;

        for (int i = 0; i < n; i++) {

            count = 0;

            for (int j = 0; j < list.size(); j++) {

                if (scores.get(i) != list.get(j)) {
                    count++;

                } else {

                    count++;
                    System.out.print(count + " ");
                    break;
                }
            }
        }
    }
    }
    //4 2 2 1 5가 되어야지 3등이 없어지고