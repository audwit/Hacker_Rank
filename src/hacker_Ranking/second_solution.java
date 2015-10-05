package hacker_Ranking;

import java.util.Scanner;

public class second_solution 
{
	public static void main(String[] args) 
    {
        int x,a,b,sum;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        for(int y=0;y<x;y++)
            {
                a =0;
                b= 0;
                a= scan.nextInt();
                b= scan.nextInt();
                sum = a+b;
                System.out.println(sum);
                
            }
        scan.close();
    }
}
