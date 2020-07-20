package InterviewQuestions;

import java.util.Scanner;

public class do_while_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int number;
int positiveno=0,negativeno=0,zeros=0;
char choice;
do {
	System.out.println("enter the no");
	number=sc.nextInt();
	if(number > 0) {
		positiveno++;
	}
	else if(number < 0) {
		negativeno++;
	}
	else{
		zeros++;
		
	}
	System.out.println("Do u want to continue y/n");
	choice =sc.next().charAt(0);
}
while(choice == 'y' || choice =='Y');

System.out.println("pos" +positiveno);
System.out.println("neos"+negativeno);
System.out.println("zero" +zeros);

	}

}
