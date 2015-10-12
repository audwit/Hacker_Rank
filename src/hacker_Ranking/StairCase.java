package hacker_Ranking;

import java.io.File;
import java.util.Scanner;

public class StairCase
{

	public static void main(String[] args)
	{
//		File file = null;
//		Scanner in = null;
//		try
//		{
//			file = new File("Staircase.txt");
//			in = new Scanner(file);
//		}
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		String s = String.format("%1$#"+n+"s", "");
//		System.out.println(s);

		
		
		for(int i=0;i<n;i++)
		{
			int y=n-i-1;
			String x="";
			if(y>0)
				{
				 	x = String.format("%"+y+"s", "");
				}
			String z="";
			for(int j=0; j<i+1;j++)
			{
				z= z.concat("#");
			}
			x = x.concat(z);
			System.out.println(x);
		}
		
	}

}
