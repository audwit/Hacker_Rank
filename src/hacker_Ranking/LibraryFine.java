package hacker_Ranking;
import java.io.File;
import java.util.Scanner;
public class LibraryFine
{

	public static void main(String[] args)
	{
		File file = null;
		Scanner in =null;
		
		try
		{
			file = new File("LibraryFine.txt");
			in = new Scanner(file);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		//Scanner in = new Scanner(System.in);
		String expectedReturnDate,returnDate;
		returnDate = in.nextLine();
		expectedReturnDate = in.nextLine();
		
		//***********This code seperates the day,month and year of Expected return day and actual return day
		//***********And stores it in variable for later computation
		int erdDay,erdMonth,erdYear,rdDay,rdMonth,rdYear,fine=0;
		String strErdDay,strErdMonth,strErdYear,stRdDay,strRdMonth,strRdYear;
		String[] erdArray,rdArray;
		//Separate day month and year of expected return date and store it in an array
		erdArray = expectedReturnDate.split(" "); 
		//Separate day month and year of return date and store it in an array
		rdArray = returnDate.split(" ");
		//Get the date,month and year of expected return date in integer variables
		erdDay = Integer.parseInt(erdArray[0]);
		erdMonth = Integer.parseInt(erdArray[1]);
		erdYear = Integer.parseInt(erdArray[2]);
		//Get the date,month and year of return date in integer variables
		rdDay = Integer.parseInt(rdArray[0]);
		rdMonth = Integer.parseInt(rdArray[1]);
		rdYear = Integer.parseInt(rdArray[2]);
		//***********This code seperates the day,month and year of Expected return day and actual return day
		//***********And stores it in variable for later computation
		
		if(erdYear==rdYear && erdMonth==rdMonth && rdDay<=erdDay)
			fine=0;
		if(erdYear==rdYear && erdMonth==rdMonth && rdDay>erdDay)
			fine= 15*(rdDay-erdDay);
		if(erdYear==rdYear && rdMonth>erdMonth)
			fine= 500*(rdMonth-erdMonth);
		if(rdYear>erdYear)
			fine= 10000;
		
//		System.out.println(erdDay +"xxxxx"+ erdMonth + "xxxxxx"+ erdYear);
//		System.out.println(rdDay +"xxxxx"+ rdMonth + "xxxxxx"+ rdYear);
		System.out.println(fine);
	}

}
