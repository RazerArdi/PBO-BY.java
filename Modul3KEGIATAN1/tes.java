package Modul3KEGIATAN1;

import java.math.BigInteger;
import java.security.SecureRandom;

public class tes {
    private static final BigInteger p = new BigInteger("2579");
    private static final BigInteger g = new BigInteger("2");
    private static final BigInteger x = new BigInteger(10, new SecureRandom());
    private static final BigInteger y = g.modPow(x, p);

    public static void main(String[] args) {
        BigInteger plaintext = new BigInteger("66658985326582687389657883896572");
        System.out.println("Plaintext: " + plaintext);

        BigInteger k = new BigInteger(10, new SecureRandom());
        BigInteger a = g.modPow(k, p);
        BigInteger b = plaintext.multiply(y.modPow(k, p)).mod(p);

        System.out.println("Encrypted message: (" + a + ", " + b + ")");

        BigInteger decrypted = b.multiply(a.modPow(x.negate(), p)).mod(p);
        System.out.println("Decrypted message: " + decrypted);
    }
}
