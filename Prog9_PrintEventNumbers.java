package CoreJava_Assignment1;

public class Prog9_PrintEventNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Below are the even numbers till 50");
		System.out.println("==================================");
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
	}

}
