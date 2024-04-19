package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check for rows validation
        for (int i = 0; i < 9; i++) {
            Set<Character> characterSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (characterSet.contains(board[i][j])) {
                    return false;
                }
                if (board[i][j] != '.')
                    characterSet.add(board[i][j]);
            }
        }
        // Check for column validation
        for (int i = 0; i < 9; i++) {
            Set<Character> characterSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (characterSet.contains(board[j][i]))
                    return false;
                if (board[j][i] != '.')
                    characterSet.add(board[j][i]);
            }
        }
        return true;
    }
}
