package DailyTemperatures;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] daysTillHigherTemperature = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length - 1; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                daysTillHigherTemperature[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return daysTillHigherTemperature;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
