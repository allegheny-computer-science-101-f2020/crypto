package project;

import java.util.*;

/** Decoder.
 * @author Peter Snipes
 */

public class Alphabet {
  public String upper2Lower(String message) {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String tebahpla = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    String loweralphabet = "abcdefghijklmnopqrstuvwxyz";
    String lowertebahpla = "zyxwvutsrqponmlkjihgfedcba";
    String decodedstring = "";

      String newMessage = message.toUpperCase();
      System.out.println(newMessage);

for (int i = 0; i < message.length(); i ++) {
  if (message.charAt(i).isUpperCase()) {

    String Character = message.charAt(i).toLowerCase();
    System.out.println(Character);
  } else {
    System.out.println("Did Not work");
  }
}
return message;
}
}
