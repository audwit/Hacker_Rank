package hacker_Ranking;

import java.io.File;
import java.util.Scanner;

public class SherlockAndTheBeast
{

	public static void main(String[] args)
	{
		File file=null;
		Scanner in = null;
		try
		{
			file = new File("SherlockAndTheBeast.txt");
			in = new Scanner(file);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		//Scanner in =new Scanner(System.in);
		int t= in.nextInt();
		int noOfFives=0,noOfThrees=0,n=0;
		String result="";
		for(int i=0;i<t;i++)
		{
			n = in.nextInt();
			noOfFives=0;noOfThrees=0;
//****************** find out the number of threes and 5's in result ****
			if (n % 3 == 0) //if n is divisible by 3 there are n 5 s easy peasy
				noOfFives = n;
			else            //If not then we need to know how many 5's we can fit in at max        
				for(int j=n-1;j>0;j--)
				{
					int pNoOfFives=0,pNoOfThrees=0;
					if(j%3==0)
						{
							pNoOfFives=j;
							pNoOfThrees=n-j;
							if(pNoOfThrees%5==0) //This means number of threes is a multiple of 5 so we have number of 3's and 5's
							{
								noOfFives=pNoOfFives;
								noOfThrees=pNoOfThrees;
							}
						}
					}
			if(n%5==0 && noOfFives==0)
			{
				noOfThrees=n;
				noOfFives=0;
			}
		
//****************** Print result **********************		
		
			if (noOfFives>0 || noOfThrees>0)
				{
					result="";
					for(int k=0;k<noOfFives;k++)  //Creating the result string with 5's and 3's to print later
					{
						result=result.concat("5");
					}
					for(int k=0;k<noOfThrees;k++)
					{
						result=result.concat("3");
					}
					System.out.println(result);
				}
//****************** Print result **********************	
			else
				System.out.println("-1");;
			
		}
				
		}
	}

