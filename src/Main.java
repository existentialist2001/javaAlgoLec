import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        //
        //결과 저장 배열(학생 수만큼), 인덱스와 데이터를 같다고 간주
        int[] result = new int[n];

        //표 탐색하면서 조사(세로로)
        //i는 학년, j는 학생
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n - 1; j++) {

                //학생을 뽑음
                int student = arr[j][i];

                //나머지 학생들과 비교
                for (int k = j + 1; k < n; k++) {

                    int otherStudent = arr[k][i];
                    //반이 같다면
                    if (student == otherStudent) {
                        //두 학생 모두 업데이트를 해주는데,
                        result[j]++;
                        result[k]++;
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int tempMaster = 0;

        for (int i = 0; i < n; i++) {

            if (result[i] > max) {
                max = result[i];
                tempMaster = i + 1;
            }
        }
        System.out.println(tempMaster);
    }
}