package CoreJava_Assignment1;

public class Prog2_PrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0, j=1, k=0, next=0, count=10;
		
		System.out.println("The Fibonacci series");
		System.out.println("====================");
		System.out.print(i+", "+j);
		
		for(k=2;k<count;k++)
		{
			next=i+j;
			System.out.print(", "+ next);
			i=j;
			j=next;
						
		}
		
	}

}
