package conditionalStatements;

import java.util.Scanner;

public class LowerorNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any charcter");
		char ch=scan.next().charAt(0);
		if(ch>='a'&&ch<='z') {
			System.out.println("given char is a lowercase");
		}
		else {
			System.out.println("given character is not a lowercase");
		}



	}

}
