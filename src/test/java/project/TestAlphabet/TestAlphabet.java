package project;


/**
 * A JUnit test suite for the Alphabet class.
 *
 * @author Peter Snipes
 */
import static org.junit.Assert.assertEquals ;
import org.junit.Ignore;
import org.junit.Test;

public class TestAlphabet {

  @Test
  public void testValidLetterSwitch() {
    Alphabet alph = new Alphabet();
    String validLetterSwitch = alph.upper2Lower("PeterSnipes");
    assertEquals(validLetterSwitch, "pETERsNIPES");
  }
  @Test
  public void testValidLetterSwitch2() {
    Alphabet alph = new Alphabet();
    String validLetterSwitch = alph.upper2Lower("AlexisCaldwell");
    assertEquals(validLetterSwitch, "aLEXIScALDWELL");
  }
  @Test
  public void testValidLetterSwitch3() {
    Alphabet alph = new Alphabet();
    String validLetterSwitch = alph.upper2Lower("ZackeryDevers");
    assertEquals(validLetterSwitch, "zACKERYdEVERS");
  }
}
