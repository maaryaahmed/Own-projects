import java.util.Arrays;

public class EightQueens {

     /**
    @param args Handles command-line argument
     */

    //public static char[][] chessBoard = new char [8][8];
    public static int sizeBoard = 8;
    public static char[][] chessBoard = new char [sizeBoard][sizeBoard];

    public static void main(String[] args)
    {
        //char[][] chessBoard = new 
        EightQueens board = new EightQueens();
        board.originalBoard();
    }

    public void originalBoard()
    {
        char[][] board = {{0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0} };
        printBoard(chessBoard);
        setQueen(0, 0);

    }
    //method getBoard
    public static void printBoard(char[][] chessBoard){

        //board = chessBoard[][];
        // to create the original board without any queens
        //char[][] chessBoard = new char[sizeBoard][sizeBoard];
        
        System.out.println("The original board: ");
        for(int rows = 0; rows < chessBoard.length; rows++)
        {
            for(int cols = 0; cols < chessBoard[rows].length; cols++)
            {
                chessBoard[rows][cols] = 'o';
                //System.out.println("The original board: ");
                System.out.print(" " + chessBoard[rows][cols] + " ");
            }
            System.out.println();
        }
        //setQueen(0, 0);
        
    }

    public static void getBoard(){
        setQueen(1,1);

    }

    //method setQueen
    public static void setQueen(int row, int column){
        for(int i = 0; i < chessBoard.length; i++)
        {
            for(int j = 0; j < chessBoard[i].length;j++)
            {
                if(isMoveSafe(chessBoard, row, column))
                {
                    System.out.println("\n");
                    chessBoard[row][column] = 'Q';
                    System.out.print(" " + chessBoard[row][column] + " ");
                }
            }
            System.out.println();
            
        }
    }

    public static boolean isMoveSafe(char[][] chessBoard, int row, int col)
    {
        //the point of this method is that to check if there are any queens on their corresponding row, column or diagonals
        //checking rows
        for(int i = 0; i < col; i++)
        {
            if(chessBoard[row][i] == 'Q')
            {
                return false;
            }
        }

        //checking columns
        for(int j = 0; j < row; j++)
        {
            if(chessBoard[col][j] == 'Q')
            {
                return false;
            }
        }

        //checking diagonals
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--)
        {
            if(chessBoard[col][j] == 'Q')
            {
                return false;
            }
        }
        
        //if the move is good, return true 
        return true;

    }
            
    
    //method emptySquare
    public void emptySquare(int row, int column)
    {
        ;
    }
    //method set Remaining Queens
    public boolean setQueens(int queensRemaining)
    {
        
        if(queensRemaining == 0)
        {
        return true;
        }

        return false;

    }

    


}
