package InterviewQuestions;

import java.util.Scanner;

public class countoflettersandothers {
    
 public static void main(String[] args) {
	 countoflettersandothers.count();

	}
	public static void count(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String d=sc.nextLine();
		char[] ch = d.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < d.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
			}

}
