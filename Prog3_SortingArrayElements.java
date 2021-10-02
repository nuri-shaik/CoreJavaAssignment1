package CoreJava_Assignment1;

public class Prog3_SortingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = new int[] {10,4,9,20,35,99,74};
		
		System.out.println("The Original Given Array is");
		System.out.println("===========================");
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
		
		array1 = SortedArray(array1);
		
		System.out.println();System.out.println();
		System.out.println("The Array after sorting in Ascending Order");
		System.out.println("=========================================");
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] SortedArray(int[] array2)
	{
		int temp=0;
		for(int i=0;i<array2.length;i++) {
			for(int j=i+1;j<array2.length;j++) {
				if(array2[i]>array2[j]) {
					temp=array2[i];
					array2[i]=array2[j];
					array2[j]=temp;
				}
			}
		}
		
		return array2;
	}

}
