package restudy.hashMapAndTreeSet.p0402;

import java.util.HashMap;
import java.util.Scanner;

public class LecSol2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String answer = "YES";

        HashMap<Character,Integer> aMap = new HashMap<>();
        HashMap<Character,Integer> bMap = new HashMap<>();

        String a = kb.nextLine();
        String b = kb.nextLine();

        for (char c : a.toCharArray()) {
            aMap.put(c,aMap.getOrDefault(c,0) + 1);
        }

        for (char c : b.toCharArray()) {
            bMap.put(c,bMap.getOrDefault(c,0) + 1);
        }

        for (char aKey : aMap.keySet()) {

            if (bMap.containsKey(aKey)) {
                if (!bMap.get(aKey).equals(aMap.get(aKey))) {
                    answer = "NO";
                    break;
                }
            }
            else {
                answer = "NO";
                break;
            }
        }

        System.out.print(answer);
    }
}