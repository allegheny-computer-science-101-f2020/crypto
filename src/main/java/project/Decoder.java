package project; 

import java.util.*;

/** Decoder.
 * @author Lex Caldwell
 */ 

public class Decoder {
  //instance variables
  private String alphabet = "abcdefghijklmnopqrstuvwxyz";
  private String input; 
  
  public Decoder(String input) {
    this.input = input;
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
  }
}

/** This was my attempt to create a hashmap version of letterToNumber. */
/** It halfway works meaning it turns a letter to a number however, when user goes to add a space to the message it fails. */
/* Map<String, Integer> hm1 = new HashMap<>();
    hm1.put("a",1);
    hm1.put("b",2);
    hm1.put("c",3);
    hm1.put("d",4);
    hm1.put("e",5);
    hm1.put("f",6);
    hm1.put("g",7);
    hm1.put("h",8);
    hm1.put("i",9);
    hm1.put("j",10);
    hm1.put("k",11);
    hm1.put("l",12);
    hm1.put("m",13);
    hm1.put("n",14);
    hm1.put("o",15);
    hm1.put("p",16);
    hm1.put("q",17);
    hm1.put("r",18);
    hm1.put("s",19);
    hm1.put("t",20);
    hm1.put("u",21);
    hm1.put("v",22);
    hm1.put("w",23);
    hm1.put("x",24);
    hm1.put("y",25);
    hm1.put("z",26);

      for (int i = 0; i < str.length(); i++) {
        if (str.length() != 0) {
          char hope = str.charAt(i);
          String pls = String.valueOf(hope);
          int num = hm1.get(pls); 
          System.out.print(num + "-");
        } //end of the if 
      }// end of the for
     */