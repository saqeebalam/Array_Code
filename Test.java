package PrimeNumber;

public class Test {
	public static void main(String[] args) {
		int arr[]= {2,1,3,4,5,6,7,11,21,29,43,44,56,23};
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)!=0) {
					if(arr[i]==2 || arr[i]==3 || arr[i]==7 || arr[i]==5) {
						System.out.println("Prime Number="+arr[i]);
						continue;
					}
				if(arr[i]%3==0 || arr[i]%7==0 || arr[i]%5==0) {
				 System.out.println("Odd number="+arr[i]+" ");}
				else {
					System.out.println("Prime Number="+arr[i]);
				}
			}
		}
	}

}
