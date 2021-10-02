package CoreJava_Assignment1;

import java.util.Scanner;

public class Prog6_FindAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float base=0, height=0, area=0;
		
		Scanner myNum = new Scanner(System.in);
		
		System.out.println("Enter the Base of a triangle: ");
		base = myNum.nextFloat();
		
		System.out.println("Enter Height of a triangle: ");
		height = myNum.nextFloat();

		area = (base*height)/2;

		System.out.println("The Area of give triangle is: "+ area);
		myNum.close();
	}

}
