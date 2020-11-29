package project;

/** railFenceCipher
 * @author zackery devers
 */

public class RailFenceCipher {
	int numRails;

	public RailFenceCipher(int numRails) {
		this.numRails = numRails;
	}

	String getDecryptedData(String data) {
		char[] decrypted = new char[data.length()];
		int n = 0;
		for(int k = 0 ; k < numRails; k ++) {
			int index = k;
			boolean down = true;
			while(index < data.length() ) {
				//System.out.println(k + " " + index+ " "+ n );
				decrypted[index] = data.charAt(n++);

				if(k == 0 || k == numRails - 1) {
					index = index + 2 * (numRails - 1);
				}
				else if(down) {
					index = index +  2 * (numRails - k - 1);
					down = !down;
				}
				else {
					index = index + 2 * k;
					down = !down;
				}
			}
		}
		return new String(decrypted);
	}
