package InterviewQuestions;

import java.util.Scanner;

public class StringtoInt {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        System.out.print("Input a String ");
	        String a = in.nextLine();
			int result = Integer.parseInt(a);
	        System.out.println("The integer value is " + result);
		

}
}