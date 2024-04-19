package IsSubsequence;

public class Solution {
    public static boolean isSubsequence(String s, String t) {
        int start = 0;
        int end = s.length();
        int counter = 0;
        while (start < end) {
            if (counter > t.length()) {
                return false;
            }
            if (s.charAt(start) == t.charAt(counter)) {
                start++;
                counter++;
            }

            counter++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
}
