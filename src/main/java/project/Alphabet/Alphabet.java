package project;

import java.util.*;

/** Decoder.
 * @author Peter Snipes
 */

public class Alphabet {
  public String upper2Lower(String message) {
    // String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //  String loweralphabet = "abcdefghijklmnopqrstuvwxyz";
    // String newMessage = message.toUpperCase();
    // System.out.println(newMessage);

    StringBuffer newMessage = new StringBuffer();
    for (int i = 0; i < message.length(); i ++) {
      char[]word = new char[100];
      word [i] = message.charAt(i);
      if (Character.isLowerCase(word[i])) {
        newMessage.append(Character.toUpperCase(word[i]));
        } else {
          newMessage.append(Character.toLowerCase(word[i]));
        }
      }
      String newestMessage = newMessage.toString();
      System.out.println("Your New Message is: " + newMessage.toString());
      return newestMessage;
    }
  }
