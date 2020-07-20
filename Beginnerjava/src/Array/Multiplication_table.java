package Array;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		System.out.println("enter the number");
		int b=a.nextInt();
		int j;
		
		for (int  i=1;i<=9;i++) {
			j=i*b;
			System.out.println(j );
			
		}
	}

}
