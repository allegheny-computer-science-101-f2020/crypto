/** Decoder.
 * @author Lex Caldwell
 */ 

public class Decoder {
  //instance variables
  private String alphabet = "abcdefghijklmnopqrstuvwxyz";

  public Decode(String input) {
    System.out.println("This is your decoder!");
  }

  //practice method to have a letter that will
  //be equivalent to an integer
  public void equalPlace(String n) {
   for(int i = 0; i < n.length(); i++){
     System.out.println(alphabet.indexOf(n.charAt(i)) + 1);
   }
  } // equalPlace end
}