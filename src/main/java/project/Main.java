package project;

import java.util.Scanner;

/**
 * Class containing the main method.
 *
 * @author Lex Caldwell
 */

public class Main {

  // TODO: add your implementation of the main method
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello! Welcome to the decoder!");
    System.out.println("Enter your secret message: ");
    String ans = input.nextLine();
    
    Decoder decode = new Decoder(ans);
    
    System.out.println("This is the message you wrote: " + ans);
    System.out.println("This is your decoded message: ");
    decode.equalPlace(ans);
  }

}
