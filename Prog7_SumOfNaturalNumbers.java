package CoreJava_Assignment1;

import java.util.Scanner;

public class Prog7_SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, sum=0;
		
		System.out.println("Sum of natural numbers upto entered value: ");
		System.out.println("Enter a number: ");
		Scanner myNum = new Scanner(System.in);
		int n = myNum.nextInt();
		myNum.close();
		
		for(i=1;i<=n;++i)
		{
			sum=sum+i;
		}
		
		System.out.println("The Sum Of first natural number up to "+n+" is: "+ sum);
	}

}
