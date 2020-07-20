package InterviewQuestions;

import java.awt.Checkbox;

public class array_contains {
	public static boolean contains (int arr[],int check) {
		for (int b:arr) {
			if(b==check) {
				return true;
			}
		}return false;
	}

	public static void main(String[] args) {
		int []d= {2,5,8,10,15,46,57};
		
		System.out.println(contains(d,2));
		
	
			}
		}
			
		


