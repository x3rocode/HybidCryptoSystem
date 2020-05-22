public class Symmetric {
	
	public static String Enc(String plain, int sessionkey) 
	{
		StringBuilder sb = new StringBuilder();
		String keybin = Integer.toBinaryString(sessionkey);

		keybin = String.format("%08d", Integer.parseInt(keybin));
		char[] plainChar = plain.toCharArray();

		for (int i = 0; i < plainChar.length; i++) 
		{
			String plainstr = Integer.toBinaryString(plainChar[i]);
			plainstr = String.format("%08d", Integer.parseInt(plainstr));
		    for (int j = 0; j < plainstr.length(); j++) {
		        sb.append(plainstr.charAt(j) ^ keybin.charAt(j));
		    }
		}
		
		return sb.toString();
	}
	
	public static String Dec(String encrypt, int decsessionkey)  //복호화
	{
		StringBuilder sb = new StringBuilder();
		String keybin = Integer.toBinaryString(decsessionkey);
		keybin = String.format("%08d", Integer.parseInt(keybin));
			
		int maxLength = 8;
		int textLen = encrypt.length();
		int loopCnt = textLen / maxLength + 1;

		String str = "";

		for (int i = 0; i < loopCnt; i++)    //8글자씩 잘라서
		{
		  int lastIndex = (i + 1) * maxLength; 

		  if(textLen > lastIndex)
		  {
			  str = encrypt.substring(i * maxLength, lastIndex);
		  }
		  else
		  {
			  str = encrypt.substring(i * maxLength);
		  }

		  for (int j = 0; j < str.length(); j++)    //sessionkey와 xor
		  {
			  sb.append(str.charAt(j) ^ keybin.charAt(j));
		  }

		}
		
		String s = sb.toString();
		String result = "";
		
		 for (int i = 0; i < s.length()/8; i++)    //toChar
		 {
			int a = Integer.parseInt(s.substring(8 * i, (i + 1) * 8), 2);
			result += (char) (a);
		 }
		
		return result;
	}
	
}
