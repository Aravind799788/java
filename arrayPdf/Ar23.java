package arrayPdf;

import java.util.Scanner;

public class Ar23 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the siz of the array"); 
		int size=scan.nextInt();
		int arr[]=new int[size]; 
		System.out.println("enter target element");
		int target=scan.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i])
				count++;
		}
		if(count==0) {
			System.out.println("elemenst is not found");
		}else {
			System.out.println("elemenst is found");
		}
		
	}

}
