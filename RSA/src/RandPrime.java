import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandPrime {
	
	final static int MAX = 70;
	final static int MIN = 20;    
	
	public static List<Integer> getRandPrime()
	{

		List<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> ary = new ArrayList<Integer>();
		
 		ary = getPrime();
 		list.add(1);
 		list.add(1);
		
		while(list.get(0) == list.get(1))
		{
			list.clear();
			for(int i = 0; i < 2; i++)
			{
				list.add(getRand(ary));
			}
		}
		
		return list;
	}
	
	private static ArrayList<Integer> getPrime() //¼Ò¼ö
	{
		ArrayList<Integer> primeary = new ArrayList<Integer>();

		for(int i = MIN; i < MAX; i++)
		{
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0) break;
				else primeary.add(i);
			}
		}
		
		return primeary;
	}
	
	private static int getRand(ArrayList<Integer> primeary)  //¼ÅÇÃ
	{
		Collections.shuffle(primeary);
		
		return primeary.get(0);
	}
}
