package CoreJava_Assignment1;

import java.util.Scanner;

public class Prog1_FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7, num1=1;
		int factorial = findFactorial(num);
		
		Scanner myNum = new Scanner(System.in);
		
		System.out.println("Enter a number to findout Factorial:- ");
		num1 = myNum.nextInt();
		
		System.out.println("The Factorial of the given number is: "+ factorial);
		System.out.println("The Factorial of the entered number is: "+ findFactorial(num1));
		
		myNum.close();
	}	
	
	public static int findFactorial(int num) 
	{
		int i=1, fact=1;
		
		while(i<=num)
		{
			fact = fact*i;
			i++;
		}
		return fact;
	}
}
