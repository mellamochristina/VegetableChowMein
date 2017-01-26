package chessPiece;

public class chessPiece {
	int col;
	int row;
	boolean isAttacking (chessPiece c) {
		//check to make sure that two pieces are not in the same square
	}
	boolean findPiece () {
		//find what piece is at given square
		//read in every 2nd input line using scanner
	}
	boolean verifySolution (chessPiece [] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			for (int j = 0; j < pieces.length; j++) {
				if pieces[i].isAttacking(pieces[j]) {
					return false;
				}
				return true;
			}
		}
	}
	class King extends chessPiece {
		boolean isAttacking (chessPiece c) {
			//king can attack 1 square in any direction
		}
	}
	class Queen extends chessPiece {
		boolean isAttacking (chessPiece c) {
			//queen can attack up,down,left,right,and diagonal
		}
	}
	class Rook extends chessPiece {
		boolean isAttacking (chessPiece c) {
			//rook can attack up,down,left, and right
		}
	}
	class Bishop extends chessPiece {
		boolean isAttacking (chessPiece c) {
			//bishop can attack diagonally
		}
	}
	class Knight extends chessPiece {
		boolean isAttacking (chessPiece c) {
			//knight can attack L-shape
		}
	}
}
