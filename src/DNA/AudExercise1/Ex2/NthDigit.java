package DNA.AudExercise1.Ex2;

import java.util.Arrays;

public class NthDigit {

    public static void findNumber(int n) {
        int[] array = new int[100];
        int k = 1;
        for (int i = 1; k < n + 1; i++) {
            addToArray(array, k, i);
            k = k + String.valueOf(i).length();
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[n]);
    }

    public static void addToArray(int[] array, int k, int number) {
        String numberAsString = String.valueOf(number);
        for (int i = 0; i < numberAsString.length(); i++) {
            array[k + i] = Character.getNumericValue(numberAsString.charAt(i));
        }
    }

    public static void findNumberShorter(int n) {
        int k = 1;
        int s = 9;

        while (s < n) {
            k = k + 1;
            s = s + 9 * (int) (Math.pow(10, k - 1)) * k;
        }

        int c = n - s;
        int result = (int) ((Math.pow(10, k - 1) - Math.ceil((double) c / k)) / Math.pow(10, ((int) Math.log10(c / k))) % 10);
        System.out.println(result);
    }


    public static void main(String[] args) {
        findNumber(21);
        findNumberShorter(21);
    }
}
