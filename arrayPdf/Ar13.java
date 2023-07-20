package arrayPdf;

import java.util.Scanner;

public class Ar13 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the siz of the array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length/2;i++) {
			count++;
		}
		int index=0;
		int a[]=new int[count];
		for(int i=0;i<arr.length/2;i++) {
			a[index++]=arr[i];
		}
		int sum=0;
		for(int b:a) {
			sum=sum+b;
		}
		System.out.println(sum/count);
	}
}
