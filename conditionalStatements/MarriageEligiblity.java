package conditionalStatements;

import java.util.Scanner;

public class MarriageEligiblity {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter boy age");
		int male=scan.nextInt();
		System.out.println("enter girl age");
		int female=scan.nextInt();
		
		if(male>=21&&female>=18) {
			System.out.println("eligible for marriage");
		}
		else {
			System.out.println("not eligible for marriage");
		}
	}

}
