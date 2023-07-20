package arrayPdf;

import java.util.Scanner;

public class Ar22 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the siz of the array"); 
		int size=scan.nextInt();
		int arr[]=new int[size]; 
		System.out.println("enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		int fm=arr[0],sm=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<fm) {
				sm=fm;
				fm=arr[i];
			}
		}
		System.out.println(sm);

	}

}
