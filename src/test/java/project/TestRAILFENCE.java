package project;


/**
 * A JUnit test suite.
 *
 * @author zackery devers
 */
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestRAILFENCE {

	private RailFenceCipher railFenceCipher;

	@Test
	public void encodeWithTwoRails() {
		railFenceCipher = new RailFenceCipher(2);
		Assert.assertEquals("XXXXXXXXXOOOOOOOOO",
			railFenceCipher.getEncryptedData("XOXOXOXOXOXOXOXOXO"));
	}
}
