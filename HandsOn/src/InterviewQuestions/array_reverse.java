package InterviewQuestions;

import java.util.Scanner;

public class array_reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		char[] rev = sc.nextLine().toCharArray();
		for (int i = rev.length - 1; i >= 0; i--) {
			System.out.print(rev[i]);

		}

	}

}
