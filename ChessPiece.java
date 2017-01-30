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
		/*
		check to see if this attack function is correct
		*/
		
		if (row==c.row++||col==c.col++)
			return true;
		else if (Math.abs(row-c.row-1)==Math.abs(col-c.col-1))
			return true;
		else
		return false;
	}
}

class Queen extends ChessPiece {
	Queen (char piece, int col, int row) {
		super(piece, col, row);
	}
	boolean isAttacking (ChessPiece c) { //from HW1 solution
		//queen can attack up,down,left,right,and diagonal
	if (row ==c.row || col == c.col) // if piece has same row or column as c, piece is attacking c
            return true;
	// if piece is on same diagonal as c, this is attack. we use absolute values to determine diagonal
        else if (Math.abs(row-c.row) == Math.abs(col - c.col)) 
            return true;
        else
            return false; // piece is not attacking c
	}
	
}

class Rook extends ChessPiece {
	Rook (char piece, int col, int row) {
		super(piece, col, row);
	}
	boolean isAttacking (ChessPiece c) {
		//rook can attack up,down,left, and right
		if (row==c.row||col==c.col) //if piece has same row or column as c, piece is attacking c
			return true;
		else
		return false; 
	}
}

class Bishop extends ChessPiece {
	Bishop (char piece, int col, int row) {
		super(piece, col, row);
	}
	boolean isAttacking (ChessPiece c) {
		//bishop can attack diagonally
		if (Math.abs(row-c.row) == Math.abs(col - c.col)) //if piece is on same diagonal as c, it attacks c
			return true;
		else
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
