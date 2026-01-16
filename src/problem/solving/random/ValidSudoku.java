package problem.solving.random;
import java.util.HashSet;
import java.util.Set;
public class ValidSudoku {

    public static void main(String[] args) {
        char[][] arr = {
            {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(arr));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<String> viewed = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (!viewed.add(ch + " row " + i)
                            || !viewed.add(ch + " column " + j)
                            || !viewed.add(ch + " box " + i / 3 + "," + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
