package arrayPdf;

import java.util.Scanner;

public class Ar24 {
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
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				count++;
			}
		}
		int index=0;
		int a[]=new int[count];
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				a[index++]=arr[i];
			}
		}
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
