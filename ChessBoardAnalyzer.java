public class ChessBoardAnalyzer{
  /*
  The input.txt must contain several chessboards and queries as given in Examples.zip. 
  Your program should read 2 lines at a time, construct a chessboard, output the 
  solution (for the current chessboard considered) in analysis.txt. Then read the next chessboard and 
  query from the same input.txt file, append the output to analysis.txt. The process continues 
  until you have exhausted all the chessboards in input.txt.
 
Just to clarify, there will be no separate input text files for each board.
*/
  public static void main(String[] args) throws IOException{
    //open files
    Scanner in = new Scanner(new File("input.txt"));
    PrintWriter out = new PrintWriter(new FileWriter("analysis.txt"));
    //read lines from input.txt
    for(int i=0; i<in.hasNextLine(); i++){
      int newLine = 0;
      //split line around new line
      String[] token = line.split("\n");
      int newLine++;
      while(in.hasNextLine()&&newLine<2){
        /*
         * read in characters and col/row for pieces
         * 
         * */
        
        ChessBoard board = new ChessBoard();
        
        /*
         * add chess pieces to board
         * 
         *
         * ChessPiece[] pieces = {new King(), new Queen(), new Rook(), new Knight(), new Bishop()}; 
         * */
        
        /*
         * analyze chess board
         * 
         * */
        
        //write result of chess board analysis to analysis.txt
        System.out.println(result);
      }
    }
    in.close();
    out.close();
  }
}
