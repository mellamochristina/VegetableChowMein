public class ChessPiece {
	char piece;
	int col;
	int row;
	
	ChessPiece (char piece, int col, int row) {
		this.piece = piece;
		this.col = col;
		this.row = row;
		
	}
	

	boolean isAttacking (ChessPiece c) {
		return false;
	}
}

class King extends ChessPiece {
	King (char piece, int col, int row) {
		super(piece, col, row);
	}

	boolean isAttacking (ChessPiece c) {
		//king can attack 1 square in any direction
		return false;
	}
}

class Queen extends ChessPiece {
	Queen (char piece, int col, int row) {
		super(piece, col, row);
	}
	boolean isAttacking (ChessPiece c) {
		//queen can attack up,down,left,right,and diagonal
		return false;
	}
}

class Rook extends ChessPiece {
	Rook (char piece, int col, int row) {
		super(piece, col, row);
	}
	boolean isAttacking (ChessPiece c) {
		//rook can attack up,down,left, and right
		return false;
	}
}

class Bishop extends ChessPiece {
	Bishop (char piece, int col, int row) {
		super(piece, col, row);
	}
	boolean isAttacking (ChessPiece c) {
		//bishop can attack diagonally
		return false;
	}
}

class Knight extends ChessPiece {
	Knight (char piece, int col, int row) {
		super(piece, col, row);
	}
	boolean isAttacking (ChessPiece c) {
		//knight can attack L-shape
		return false;
	}
}
