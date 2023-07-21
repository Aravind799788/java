package conditionalStatements;

import java.util.Scanner;

public class DigitOrnot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any charcter");
		char ch=scan.next().charAt(0);
		if(ch>='0'&&ch<='9') {
			System.out.println("given char is a digit");
		}
		else {
			System.out.println("given character is not a digit");
		}


	}

}
