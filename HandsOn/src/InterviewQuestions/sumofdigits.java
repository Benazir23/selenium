package InterviewQuestions;

import java.util.Scanner;

public class sumofdigits {

	static long b;
		public static long sumofdigit()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no");
			long  a=sc.nextLong();
			int sum=0;
			while(a>0) {
				sum+=a%10;
				a/=10;
				b=a+sum;
			}return b;
				
			}

			
		
		public static void main(String[] args) {
		
System.out.println(sumofdigits.sumofdigit());
	}	
		
		
	}

