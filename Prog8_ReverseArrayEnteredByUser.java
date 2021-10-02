package CoreJava_Assignment1;

import java.util.Scanner;

public class Prog8_ReverseArrayEnteredByUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		
		int size=sc.nextInt();
		System.out.println("the Size is: "+ size);		
		int[] array = new int[size];
		
		array=readArrayElements(array);
		
		System.out.println("The Original Array entered by User is: ");
		System.out.println("=======================================");
		printArray(array);
		
		array=reverseArrayElements(array);
		
		System.out.println("The Reversed Array of the Original Array: ");
		System.out.println("==========================================");
		printArray(array);
		
		sc.close();
	}
	
	public static int[] reverseArrayElements(int[] array)
	{
		int[] reversedArray = new int[array.length];
		int j=array.length;
		for(int i=0;i<array.length;i++)
		{
			reversedArray[j-1]=array[i];
			j=j-1;
		}
		
		return reversedArray;
	}
	
	public static int[] readArrayElements(int[] array) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the elements of the Array:");
		System.out.println("================================");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc1.nextInt();			
		}
		sc1.close();
		
		return array;
	}

	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
