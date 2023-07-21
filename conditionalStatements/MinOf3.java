package conditionalStatements;

import java.util.Scanner;

public class MinOf3 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int a=scan.nextInt();
	System.out.println("enter the number");
	int b=scan.nextInt();
	System.out.println("enter the number");
	int c=scan.nextInt();
	if(a<b&&a<c) {
		System.out.println(a+" is small");
	}
	else if(b<c) {
		System.out.println(b+" is small");
	}
	else {
		System.out.println(c+" is small");
	}
}

}
