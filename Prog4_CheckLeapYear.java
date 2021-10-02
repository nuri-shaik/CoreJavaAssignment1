package CoreJava_Assignment1;

import java.util.Scanner;

public class Prog4_CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a year to findout Leap Year or not:- ");
		Scanner myNum = new Scanner(System.in);
		int year = myNum.nextInt();
		
		if(isLeapYear(year))
			System.out.println("The Entered year is a Leap Year");
		else
			System.out.println("The Entered year is not a Leap Year");

		myNum.close();
	}
	
	public static boolean isLeapYear(int year)
	{
		if(year%400==0)
			return true;
		else if(year%100 == 0)
			return false;
		else if (year%4==0)
			return true;
		else
			return false;
				
	}

}
