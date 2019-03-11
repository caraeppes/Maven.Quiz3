package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[] rows;
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        rows = new String[3];
        board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            board[i][i] = rows[i];
        }
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < 3; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return isHomogenous(row);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return isHomogenous(column);
    }

    public Boolean isHomogenous(String[] rowOrColumn) {
        String firstValue = rowOrColumn[0];
        for (String string : rowOrColumn) {
            if (!string.equals(firstValue)) {
                return false;
            }
        }
        return true;
    }

    public Boolean isTopLeftToBottomRightDiagonalHomogenous(){
        return ((board[0][0].equals(board[1][1])) && board[0][0].equals(board[2][2]));
    }

    public Boolean isBottomLeftToTopRightDiagonalHomogenous(){
        return ((board[0][2].equals(board[1][1])) && board[0][2].equals(board[2][0]));
    }

    public String getWinner() {
        for(int i = 0; i < 3; i++){
            if(isRowHomogenous(i)){
                return board[i][0];
            }
            if(isColumnHomogeneous(i)){
                return board[0][i];
            }
            if(isTopLeftToBottomRightDiagonalHomogenous()){
                return board[0][0];
            }
            if (isBottomLeftToTopRightDiagonalHomogenous()) {
                return board[0][2];
            }
        }
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
