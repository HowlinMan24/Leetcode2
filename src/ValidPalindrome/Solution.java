package ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        st.append(s.replaceAll("[^a-zA-Z0-9]", ""));
        return s.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(st.reverse().toString());
    }
}
