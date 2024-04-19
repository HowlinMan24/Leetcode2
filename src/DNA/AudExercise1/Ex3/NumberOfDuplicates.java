package DNA.AudExercise1.Ex3;

public class NumberOfDuplicates {

    public static void printRepeatingSlowest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.print(array[i] + " ");
            }
        }
    }

    public static void printRepeatingTwoArray(int[] array) {
        int[] count = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (count[array[i]] == 1)
                // With this the value of the element inside the array[i] is used like an index to check inside the count array
                System.out.print(array[i] + " ");
            else
                count[array[i]] = count[array[i]] + 1;
        }
    }

    public static void printRepeatingCompliment(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[Math.abs(array[i])] > 0)
                array[Math.abs(array[i])] = -1 * array[Math.abs(array[i])];
            else
                System.out.print(Math.abs(array[i]) + " ");
        }
    }

    public static void printRepeatingWithSizeOfArrayAsCounter(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = array[i] % array.length;
            array[x] = array[x] + array.length;
        }
        /*
        The for loop above takes the remain and uses it as an index for the array to increase the number in that position in the array
         */
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array.length * 2)
                System.out.print(i + " ");
        }
        /*
        The code above takes the array and checks if there are copies by seeing if the number is bigger then the array size
         */
    }

    public static void main(String[] args) {
        printRepeatingSlowest(new int[]{1, 2, 3, 6, 3, 6, 1});
        System.out.println();
        printRepeatingTwoArray(new int[]{1, 2, 3, 6, 3, 6, 1});
        System.out.println();
        printRepeatingCompliment(new int[]{1, 2, 3, 6, 3, 6, 1});
        System.out.println();
        printRepeatingWithSizeOfArrayAsCounter(new int[]{1, 2, 3, 6, 3, 6, 1});
        System.out.println();
    }
}
