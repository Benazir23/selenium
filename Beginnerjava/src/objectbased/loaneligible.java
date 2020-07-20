
package objectbased;

import java.util.Scanner;

public class loaneligible {

		int card_limit;
		int salary;
		
		public int Salary() {
		Scanner sal =new Scanner (System.in);
		System.out.println("enter the salary ");
		salary =sal.nextInt();
		
		return salary;
		
			}
		public int card_limit() {
		
		Scanner limit =new Scanner(System.in);
		System.out.println("enter the card limit");
		 card_limit=limit.nextInt();
		return card_limit;
		
	}
}

