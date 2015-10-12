package hacker_Ranking;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials
{

	public static void main(String[] args)
	{
//		File file=null;
//		Scanner in = null;
//		try
//		{
//			file= new File ("ExtraLongFactorials.txt");
//			in = new Scanner(file);
//		}
//		
//		catch (Exception ex)
//		{
//			ex.printStackTrace();
//		}
		Scanner in = new Scanner(System.in);
		
		int n= in.nextInt();
		
		BigInteger factorial=new BigInteger("1");
		BigInteger bigN =BigInteger.valueOf(Integer.valueOf(n));
		BigInteger x= new BigInteger("1");
		
		
		while(n>1)
		{
			factorial=factorial.multiply(bigN);
			n--;
			bigN= bigN.subtract(x);
			//System.out.println(factorial);
		}
		
		System.out.println(factorial);
		

	}
	

}
