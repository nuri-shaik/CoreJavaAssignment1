package CoreJava_Assignment1;

public class Prog5_PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,flag;
		System.out.println("The first 10 Prime Number are:");
		System.out.println("==============================");
		System.out.println();
		
		for(i=1;i<=10;i++)
		{
			if(i==0||i==1)
				continue;
			
			flag = 1;
			
			for(j=2;j<=i/2;++j)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			
			if(flag == 1)
				System.out.print(i+", ");
		}
	}

}
