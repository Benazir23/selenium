
package String;

import java.util.Scanner;

public class Reverse_type2 {

		public static void main(String[] args) {
			
		String original="";
		Scanner word= new Scanner(System.in);
		System.out.println("enter the word to be reversed");
		original=word.nextLine();
		int length=original.length();
			
			for( int i=length-1;i>=0;i--) 
				
				
				 System.out.print(original.charAt(i));


	}

}
