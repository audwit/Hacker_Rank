package hacker_Ranking;

import java.io.File;
import java.util.Scanner;

public class AngryProfessor
{

	public static void main(String[] args)
	{
		File file=null;
		Scanner in = null;
		try
		{
			file = new File("AngryProfessor.txt");
			in = new Scanner(file);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		//Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i=0; i<x; i++)
		{
			int n = in.nextInt();
			int k = in.nextInt();
			int punctual=0,nPunctual=0;
			// Count number of punctual students
			for(int l =0; l<n; l++)  
			{
				if(in.nextInt()<=0)
					punctual++;
				else
					nPunctual++;
			}
			if(punctual>=k)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}

}
