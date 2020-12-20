package project;

/** railFenceCipher.
 * @author zackery devers
 */

public class RailFenceCipher {
  int numRails;

  public RailFenceCipher(int numRails) {
    this.numRails = numRails;
  }
  //call the encrypted data

  String getEncryptedData(String data) {
    char[] encrypted = new char[data.length()];
    int n1 = 0;

    for (int k = 0 ; k < numRails; k ++) {
      int index = k;
      boolean down = true;
      while (index < data.length() ) {
        //System.out.println(k + " " + index+ " "+ n );
        encrypted[n1++] = data.charAt(index);

        if (k == 0 || k == numRails - 1) {
          index = index + 2 * (numRails - 1);
        } else if (down) {
          index = index +  2 * (numRails - k - 1);
          down = !down;
        } else {
          index = index + 2 * k;
          down = !down;
        }
      }
    }
    System.out.println(encrypted);
    return new String(encrypted);
  }
}
