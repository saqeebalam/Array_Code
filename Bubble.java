package Sorting;
 
//Bubble Sort

public class Bubble {

	public static void main(String[] args)  throws InterruptedException {
		int arr[]=new int[] {9,8,7,6,5,3,2,1,4,0};
		int temp=0;
		int count=0;
		System.out.println("Before Bubble Sorting");
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
				if(arr[j]>arr[j+1]) {
					 temp=arr[j+1];
					 arr[j+1]=arr[j];
					 arr[j]=temp;
				}
				count++;
			}
			count++;
		}
		long endTime = System.nanoTime();//time stop after sorting
		System.out.println("After Bubble Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		long timeElapsed = endTime - startTime;
		System.out.println();
		 System.out.println("Execution time in nanoseconds: " + timeElapsed);
	     System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
	     System.out.println("Count="+count);
	}
}
