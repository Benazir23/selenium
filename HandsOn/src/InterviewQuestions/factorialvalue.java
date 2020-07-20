package InterviewQuestions;

import java.util.Locale;
import java.util.Scanner;

public class factorialvalue {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
        System.out.print("Input the no : ");
             int  a= in.nextInt();
        int b=1;
        for (int i=a;i>0;i--) {
        	b=b*i; 
			
	      	
		}	System.out.println(b);
		
	   }
	

}
