package Sorting;

//Selection sort

public class Selection {

	public static void main(String[] args) {
		int arr[]=new int[] {5,1,4,2,8};
		int temp=0;
	
		System.out.println("Before Selection Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		//time start before sorting to mesaure
		long startTime = System.nanoTime();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{    
				if(arr[i]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		long endTime = System.nanoTime();//time stop after sorting
		System.out.println("After Selection Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		long timeElapsed = endTime - startTime;
		System.out.println();
		 System.out.println("Execution time in nanoseconds: " + timeElapsed);
	     System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
	}
}
