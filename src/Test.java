import java.util.*;

public class Test {
    public static void main(String[] args) {

        //원 숫자잊아 몫이 저장될 곳
        int num = 12345;

        //뒤집힌 숫자가 저장될 곳
        int reversedNum = 0;

        //나머지 저장될 곳
        int temp = 0;

        while (num > 0) {

            temp = num % 10;
            reversedNum = reversedNum * 10 + temp;
            num = num / 10;
        }

        System.out.println("reversedNum = " + reversedNum);
    }
}
