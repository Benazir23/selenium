package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class sortingarray {

	public static void main(String[] args) {
		
		int myarray[] = {1,3,8,5,6,85,2};
		System.out.println("Original numeric array : "+Arrays.toString(myarray));
	    Arrays.sort(myarray);
	    System.out.println(Arrays.toString(myarray));
	    
	}
}	