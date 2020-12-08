package project;

import java.util.Scanner;

/**
 * Class containing the main method.
 *
 * @author Lex Caldwell, 
 */

public class Main {
  /*public String EnAtbash(String message) {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String tebahpla = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    String loweralphabet = "abcdefghijklmnopqrstuvwxyz";
    String lowertebahpla = "zyxwvutsrqponmlkjihgfedcba";
    String decodedstring = "";

    for (int i = 0; i < message.length(); i++) {
      char codedN = message.charAt(i);

      if (Character.isUpperCase(codedN)) {
        int letter = alphabet.indexOf(codedN);
        char backward = tebahpla.charAt(letter);
        decodedstring = decodedstring + backward;

      }else {
        int letter = loweralphabet.indexOf(codedN);
        char backwardS = lowertebahpla.charAt(leetterF);
        decodedstring = decodedstring + backwardS;
      }
    }
    return decodedstring();
  }*/

  // add your implementation of the main method
  public static void main(String[] args) {
    //scanner created
    Scanner input = new Scanner(System.in);
    System.out.println("Hello world!");
    System.out.println("Enter a message: ");
    String ans = input.nextLine();
    Decoder hash = new Decoder(ans);
    hash.letterToNumber(ans);
    
  }

}
