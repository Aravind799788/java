package arrayPdf;

import java.util.Scanner;

public class Ar19 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
			  System.out.println("enter the siz of the array"); 
			  int size=scan.nextInt();
			  int arr[]=new int[size]; 
			  System.out.println("enter the elements");
			  for(int i=0;i<size;i++) {
				  arr[i]=scan.nextInt();
				  }
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]<arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

	}


