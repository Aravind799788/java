package arrayPdf;

import java.util.Scanner;

public class Ar11 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the siz of the array");
		
		int size=scan.nextInt();
		int count=0;
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
			if(i%2==1)
				count++;
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==1) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum/count);

}
}
