package project; 

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import project.Decoder;

/**
 * A JUnit test suite.
 *
 * @author Lex Caldwell
 */

public class TestDecoder {
  
  @Test
  public void testSampleSentenceOneValid() {
    Decoder decode = new Decoder("Hello world");
  }
  
  @Test
  public void testSampleSentenceOneInvalid() {
    Decoder decode = new Decoder("He11o world!");
  }
  
  @Test
  public void testSampleSentenceTwoValid() {
    Decoder decode = new Decoder("Finals is close to over");
  }
  
  @Test
  public void testSampleSentenceTwoInvalid() {
    Decoder decode = new Decoder("F1nals 1s c1ose 2 over");
  }
  
  
} // end of TestDecoder