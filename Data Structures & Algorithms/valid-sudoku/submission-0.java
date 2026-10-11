class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] list = new int[9];
        for(int i = 0; i < 9; i++) {
            list =  new int[9];
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == 46) {
                    continue;
                }
                if(list[board[i][j] - 49] == 0) {
                    list[board[i][j] - 49] = 1;
                } else {
                    return false;
                }
            }
        }
        for(int i = 0; i < 9; i++) {
            list =  new int[9];
            for(int j = 0; j < 9; j++) {
                if(board[j][i] == 46) {
                    continue;
                }
                if(list[board[j][i] - 49] == 0) {
                    list[board[j][i] - 49] = 1;
                } else {
                    return false;
                }
            }
        }
        for(int i = 0; i < 9; i+=3) {
            list =  new int[9];
            for(int j = 0; j < 9; j+=3) {
                if (!checkblock(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkblock(char[][] board, int x, int y) {
        int[] list = new int[9];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[x+i][y+j] == 46) {
                    continue;
                }
                if(list[board[x+i][y+j] - 49] == 0) {
                    list[board[x+i][y+j] - 49] = 1;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
