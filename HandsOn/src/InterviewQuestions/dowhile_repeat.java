package InterviewQuestions;

import java.util.Scanner;

public class dowhile_repeat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1;
		int no2;
		char choice;
		
		do {
			System.out.println("enter the no");
			no1=sc.nextInt();	
			System.out.println("enter the no");
			no2=sc.nextInt();
			int sum=no1+no2;
			System.out.println(sum);
			System.out.println("do u want to continue again y/n?");
			choice =sc.next().charAt(0);
		}
	while(choice=='y' || choice=='Y') ;
		
	

	}	
}
	
