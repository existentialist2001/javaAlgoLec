package restudy.StackQueue.p0508;

import java.util.*;
import java.io.*;

/*
*
틀림
우선순위 큐라는 것 까지는 생각했고, 중복을 이차원 배열로 어떻게 해결할 수 있지 않을까? 했는데 너무 복잡해져서 시도X
경험적으로 항상 문제에서 중복일 때가 문제였음

이차원 배열도 아니면, Map 자료구조를 활용해야하나 싶었지만 강의 풀이는 아예 Person이라는 클래스를 만들어서 활용함
뭔가 시간이 많이 걸릴 거라고 느껴서 시도할 생각조차 못했던 방법임

추가적으로 알게 된 자바지식
보통 Integer 제네릭을 사용하면, 거기에서 값을 꺼낼 때 int로 받음
근데, int는 래퍼형이 아닌 기본형이라 null 값을 받지 못함, 그래서 이럴 경우 NullPointerException이 발생함
그래서 Integer 래퍼형으로 받거나, 값을 꺼내기 전에 비어있지 않은 지 먼저 체크해줘야함
*/

class Person {

        int id;
        int priority;

        public Person(int id, int priority) {

            this.id = id;
            this.priority = priority;
        }
    }

    class LecSol {

            public int solution(int n, int m, int[] arr) {

                int answer = 0;
                Queue<Person> Q = new LinkedList<>();
                for (int i = 0; i < n; i++) {
                    Q.offer(new Person(i,arr[i]));
                }

                while (!Q.isEmpty()) {

                    Person tmp = Q.poll();
                    for (Person x : Q) {
                        if (x.priority > tmp.priority) {
                            Q.offer(tmp);
                            tmp = null;
                            break;
                        }
                    }

                    if (tmp != null) {

                        answer++;
                        if (tmp.id == m) return answer;
                    }
                }
                return answer;
        }

    public static void main(String[] args) throws IOException{

        LecSol T = new LecSol();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}

