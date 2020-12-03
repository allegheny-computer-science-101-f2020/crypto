package project; 

/** Decoder.
 * @author Lex Caldwell
 */ 

public class Decoder {
  //instance variables
  private String alphabet = "abcdefghijklmnopqrstuvwxyz";
  
  public Decoder(String input) {
    System.out.println("This is your decoder!");
  }
  
  //practice method to have a letter that will
  //be equivalent to an integer
  /** letterToNumber ties a letter to a string. */
  public void letterToNumber(String str) {
    for (int i = 0; i < str.length(); i++) {
      if ((alphabet.indexOf(str.charAt(i)) + 1) == 0) {
        System.out.print(" ");
        continue;
      }
      System.out.print(alphabet.indexOf(str.charAt(i)) + 1 + "-");
    }
  } // letterToNumber end
}