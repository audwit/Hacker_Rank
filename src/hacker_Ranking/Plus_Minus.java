package hacker_Ranking;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Plus_Minus
{

	public static void main(String[] args)
	{
		//File file=null;
		Scanner in=null;
//		try
//		{
//			
//			file = new File("Plus_Minus.txt");
			in = new Scanner(System.in);
		//}
//		catch(Exception ex)
//		{
//			
//		}
		
		int[] array;
		int n,positiveNumbers=0,negativeNumbers=0,zeroes=0;
		n= in.nextInt();
		array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]= in.nextInt();
			if(array[i]>0)
				positiveNumbers++;
			if(array[i]<0)
				negativeNumbers++;
			if(array[i]==0)
				zeroes++;
		}
		float fpositiveNumbers, fnegativeNumbers, fzeroes; //Number of positive negative and zeroes 
		fpositiveNumbers = (float)positiveNumbers/n;
		fnegativeNumbers = (float)negativeNumbers/n;
		fzeroes = (float)zeroes/n;
		
		DecimalFormat myFormatter = new DecimalFormat("0.000");
		String output1 = myFormatter.format(fpositiveNumbers);
		String output2 = myFormatter.format(fnegativeNumbers);
		String output3 = myFormatter.format(fzeroes);
		

		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);

	}

}
