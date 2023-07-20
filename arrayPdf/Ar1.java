package arrayPdf;

import java.util.Scanner;

public class Ar1 {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the siz of the array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
				
			for(int a:arr) {
				System.out.print(a+" ");
			}
	}

}
