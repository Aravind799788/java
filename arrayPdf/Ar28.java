package arrayPdf;
import java.util.Scanner;

public class Ar28 {
		static Scanner scan=new Scanner(System.in);
		public static void main(String[] args) { 
			System.out.println("enter the size of the array");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println("enter the elements");
			for(int i=0;i<size;i++) {
				arr[i]=scan.nextInt();
			}
			System.out.println("enter the take element");
			int take=scan.nextInt();
			System.out.println("enter the repalce element");
			int replace=scan.nextInt();
			for(int i=0;i<arr.length;i++) {
				if(take==arr[i]) {
					arr[i]=replace;
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
		}
	}
