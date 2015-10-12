package hacker_Ranking;

import java.io.File;
import java.util.Scanner;

public class TimeConversion
{

	public static void main(String[] args)
	{
//		File file =null;
//		Scanner in = null;
//		try
//		{
//			file = new File("TimeConversion.txt");
//			in = new Scanner(file);
//		}
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
		
		Scanner in = new Scanner(System.in);
		String time = in.nextLine();
		String hour,minute,second,ampm;
		hour = time.substring(0, 2);
		minute = time.substring(3, 5);
		second = time.substring(6, 8);
		ampm= time.substring(8, 10);
		int inthour=0;
		inthour = Integer.parseInt(hour);
		
		if(ampm.contains("PM"))
			{
				if(inthour<12)
					{
						inthour = inthour+12;
						hour = Integer.toString(inthour);
					}
				else
					 hour="12";
				
			}
		if(ampm.contains("AM")&& inthour==12)
			hour="00";
		
		
		System.out.println(hour+":"+minute+":"+second);
	}

}
