package conditionalStatements;

import java.util.Scanner;

public class VowelsOrConsonent {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the charcter");
		char ch=scan.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("given charcter is a vowel");
		}else {
			System.out.println("given charcter is a consonent");
		}

	}

}
