package InterviewQuestions;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String args[]) {
		
    int  t1 = 0, t2 = 1;
    Scanner a=new Scanner(System.in);
    System.out.println("enter the number");
    int count=a.nextInt();
  
    
 
    while (t1 <= count)
    {
        System.out.print(t1+ " ");

        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
        
       
    }
}
}

