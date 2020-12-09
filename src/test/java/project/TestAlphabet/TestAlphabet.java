package project;


/**
 * A JUnit test suite for the Alphabet class.
 *
 * @author Peter Snipes
 */
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AlphabetTest {

  @Test
  public void testValidLetterSwitch() {
    LetterChecker checker = new LetterChecker();
    String validLetterSwitch = new String("");
    boolean isValid = checker.check(validLetterSwitch);
    assertTrue(isValid);
  }
