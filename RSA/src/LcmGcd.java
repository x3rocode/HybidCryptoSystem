import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LcmGcd {
	
	public static int getLcm(int p, int q) //최소공배수
	{
		int lcm = p * q / getGcd(p, q);
		return lcm;
	}
	
	public static int getGcd(int p, int q) //최대공약수
	{
		
		if(p < q)
		{
			int tmp;
			tmp = q;
			q = p;
			p = tmp;
		}
		
		while(q != 0)
		{
			int r = p % q;
			p = q;
			q = r;
		}
		
		return p;
	}
	
	public static int getE(int l)
	{
		int e = 0;
		int gcd = 0;
		ArrayList<Integer> ary = new ArrayList<Integer>();
		
		for(int i = 2; i < l; i++)
		{
			gcd = getGcd(l, i);
			if(gcd == 1)
			{
				ary.add(i);
				System.out.println("e : " + i);
			}

		}
		/*
		 * if(ary.isEmpty()) { System.out.println("e null : " + l); ary.add(1); } //debug
		 */
		Collections.shuffle(ary); 

		return ary.get(0);
	}
	
	public static int getD(int e, int l)
	{
		int d = 0;
		int mod = 0;
		ArrayList<Integer> ary = new ArrayList<Integer>();
		
		for(int i = 2; i < l; i++)
		{
			mod = e * i % l;
			if(mod == 1)
			{
				ary.add(i);
				System.out.println("d : " + i);
				System.out.println("-------");
			}

		}
		/*
		 * if(ary.isEmpty()) { System.out.println("d null : " + l); ary.add(1); } //debug
		 */

		Collections.shuffle(ary);    
	
		return ary.get(0);
	}
}
