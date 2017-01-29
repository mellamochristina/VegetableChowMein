import java.util.LinkedList;

public class ChessBoard {
	int boardSize;
	LinkedList<ChessPiece> pieces = new LinkedList<ChessPiece>();
	
	ChessBoard (int boardSize){
		this.boardSize = boardSize;
	}
	
	//Add chess piece to linked list
	void addPiece(ChessPiece piece) {
		pieces.add(piece);
	}
	
	//Makes sure that no pieces are placed in the same square 
	boolean validatePieces () {
		return true;
	}
	
	//Returns a string of the type of chess piece from coordinates of 2nd line of input
	//Returns "-" if no piece is found at query square
	String querySquare(int col, int row) {
		return "-";
	}
	
	//Returns string of attacking pieces' type, col, row to analysis.txt
	String determineAttackPieces() {
		return "-";
	}
}
