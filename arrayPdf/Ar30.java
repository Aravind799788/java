package arrayPdf;

import java.util.Scanner;

public class Ar30 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size of the array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println();
	}
}
