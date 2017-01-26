package chessPiece;


public class chessPiece {
	int col;
	int row;
	boolean isAttacking (chessPiece c) {
 	//check if c is at (col,row)
 	}
	//prints all values stored in linked list...pseudocode
	public void traverse(){
		Node current = head;
		while (current!= null){
			print(current.value);
			current = current.next;
		}
	}
	//returns true if query is found in the list and returns false otherwise
	boolean find(){
		//traverse
		//use a for loop. check if current instance x[i]==query
	}
	//inserts in a new value at the front of a linked list...pseudocode
	public void insert(int newValue){
		Node latest = new Node(newVal);
		latest.next = head;
		head = latest;
	}
}
