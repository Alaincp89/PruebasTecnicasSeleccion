package Tecnicas;

public class PocisionXmatriz {
    public static void main(String[] args) {
        int[][] board = new int[4][4];
        board[0][0] = 1; // La X comienza en la posición (0,0)
        int[] myArray = {1,2,-1,1,0,1,2,-1,-1,-2};

        for (int i = 0; i < myArray.length; i += 2) {
            int x = board[0][0] + myArray[i];
            int y = board[0][1] + myArray[i+1];
            if (x < 2) x = 0;
            if (x > 3) x = 3;
            if (y < 2) y = 1;
            if (y > 3) y = 3;
            board[board[0][0]][board[0][1]] = 0; // Borrar la posición anterior de la X
            board[x][y] = 1; // Colocar la X en la nueva posición
            board[0][0] = x;
            board[0][1] = y;
       }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

}
