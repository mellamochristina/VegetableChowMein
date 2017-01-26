import java.util.*;
// class that is going to be storing the linked list of ChessPiece objects
public class ChessBoard {
  static final Scanner in = new Scanner(new file("input.txt"));
  /*
  The input.txt must contain several chessboards and queries as given in Examples.zip. 
  Your program should read 2 lines at a time, construct a chessboard, output the 
  solution (for the current chessboard considered) in analysis.txt. Then read the next chessboard and 
  query from the same input.txt file, append the output to analysis.txt. The process continues 
  until you have exhausted all the chessboards in input.txt.
 
Just to clarify, there will be no separate input text files for each board.
*/
  public static void main(String[] args) {
    ChessPiece[] pieces = {new King(), new Queen(), new Rook(), new Knight(), new Bishop()};
    
    //rest is an example from worldtest.java from spring '11
    while (in.hasNext()) {
      String cmd = in.next();
      int what = in.nextInt();
      WorldObject thing = stuff[what];
      System.out.println("That's a " + thing);
      if (cmd.equals("drink")) {
        thing.drink();
      }
      else if(cmd.equals("hit")) {
        thing.hit();
      }
      else if(cmd.equals("pickup")) {
        // If thing is a dragon what will this print?
        System.out.println(thing.pickUpable);
        if (thing.canPickup()) {
          thing.pickup();
        }
        else {
          System.out.println("Can't pick that up.");
        }
      }
      else if(cmd.equals("pet")) {
        thing.pet();
      }
      else if(cmd.equals("shake")) {
        if (thing instanceof Potion) {
          Potion p = (Potion)thing;
          p.shake();
        }
        else {
          System.out.println("can't shake that");
        }
      }
      else {
        System.out.println("What?");
      }
    }
  }
}
