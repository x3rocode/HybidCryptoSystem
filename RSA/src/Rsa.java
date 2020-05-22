import java.math.BigInteger;

public class Rsa {
	
	public static int EncDec(int pe, int ed, int n)
	{
		int result = 0;
		
		BigInteger BPow, BCipher = BigInteger.ZERO;
		BCipher = BCipher.add(BigInteger.valueOf(pe));
		
		BPow = BCipher.pow(ed);  // ^
		
		result = BPow.mod(BigInteger.valueOf(n)).intValue();    // %
		
		return result;
	}
}
