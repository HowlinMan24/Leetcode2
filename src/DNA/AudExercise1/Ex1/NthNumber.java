package DNA.AudExercise1.Ex1;

import java.util.ArrayList;
import java.util.List;

public class NthNumber {

    public static int calculateSquare(int n) {
        // x^2 - x - 2n = 0
        // D = 1 - 4 * 1 * (-2n)
        int D = (int) (Math.sqrt(1 - (4 * (-2 * n))));
        return (1 + D) / 2;
    }

    public static int findNumberAtPosition(int n) {
        int index = (int) Math.ceil(Math.sqrt(2 * n));
        return n - (index * (index - 1)) / 2;
    }

    public static void findNumber(int n) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                numbersList.add(j + 1);
            }
        }
        System.out.println(numbersList);
//        System.out.println(numbersList.get(n));
        int validPoint = calculateSquare(n);
        int validPoint2 = findNumberAtPosition(n);
        System.out.println(validPoint);
        System.out.println(validPoint2);
    }

    public static void main(String[] args) {
        findNumber(15);
    }
}
