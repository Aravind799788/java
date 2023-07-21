package conditionalStatements;

import java.util.Scanner;

public class checkCharType {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the charcter");
		char ch=scan.next().charAt(0);
		if(ch>='a'&&ch<='z') {
			System.out.println("it is a lower case charcter");
		}
		else if(ch>='A'&&ch<='Z') {
			System.out.println("it is a upper case ");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("it is a digit");
		}
		else {
			System.out.println("it is special sysmbol");
		}

	}

}
