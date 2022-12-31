package Sorting;

//Insertion Sort

public class Insertion {
	
	public static void main(String[] args) {
		int arr[]=new int[] {5,4,3,2,1,-1};
		int temp , j;
	
		System.out.println("Before Insertion Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		//time start before sorting to mesaure
		long startTime = System.nanoTime();
		for(int i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && temp<arr[j-1])
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		long endTime = System.nanoTime();//time stop after sorting
		System.out.println("After Insertion Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		long timeElapsed = endTime - startTime;
		System.out.println();
		 System.out.println("Execution time in nanoseconds: " + timeElapsed);
	     System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
	
	}
}
