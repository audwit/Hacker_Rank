package hacker_Ranking;

import java.util.Scanner;

public class a_very_big_sum 
{

	public static void main(String[] args) 
	{
		long sum =0,a=0;
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0; i<n; i++)
		{
			a = in.nextLong();
			sum=sum+a;
		}
		in.close();
		System.out.println(sum);

	}

}
