package project;

import java.util.*;

/**
 * Class containing the main method.
 *
 * @author Lex Caldwell,
 */

public class Main {
  // add your implementation of the main method
  public static void main(String[] args) {
    //scanner created
    Scanner input = new Scanner(System.in);
    System.out.println("Hello world!");
    System.out.println("Enter a message: ");
    String ans = input.nextLine();
    System.out.println("Would you like to use Upper/Lowercase(0) or Decoder(1) or RailFence(2)");
    int number = input.nextInt();
    if (number == 0 ) {
      Alphabet alph = new Alphabet();
      alph.upper2Lower(ans);
    } else if(number == 1){
      Decoder decode = new Decoder(ans);
      decode.letterToNumber(ans);
    } else if (number == 2) {
      System.out.println("Please enter the number (2) again: ");
      int value = input.nextInt();
      RailFenceCipher rail = new RailFenceCipher(value);
      rail.getEncryptedData(ans);
    } else {
      System.out.println("Please Enter A 0 or 1 or 2");
    }

  }
}
