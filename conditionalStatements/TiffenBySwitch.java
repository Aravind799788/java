package conditionalStatements;
import java.util.Scanner;
public class TiffenBySwitch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the tiffen");
		String tiffen=scan.next();
		switch(tiffen) {
		case "idly":{
			System.out.println("monday");
			break;
		}
		case "dosa":{
			System.out.println("tuesday");
			break;
		}
		case "vada":{
			System.out.println("wednesday");
			break;
		}
		case "puri":{
			System.out.println("thursday");
			break;
		}
		case "bonda":{
			System.out.println("friday");
			break;
		}
		case "upma":{
			System.out.println("saturday");
			break;
		}case "chicken":{
			System.out.println("sunday");
			break;
		}
		default :
			System.out.println("invalid tiffen");
		}

	}

}
