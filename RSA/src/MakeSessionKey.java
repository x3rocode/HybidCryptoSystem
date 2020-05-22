import java.util.Random;

public class MakeSessionKey {
	
	final int MAX = 255;
	
	public static int numberGen() {

		Random rand = new Random();
		int num = rand.nextInt(256);

		return num;
	}
}
