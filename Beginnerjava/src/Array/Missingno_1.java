package Array;

import java.util.Arrays;

public class Missingno_1 {

	public static void main(String[] args) {
	
		int [] a = {1,2,5,3};
		//System.out.println(a.length);
		
		Arrays.sort(a);
		//System.out.println(a[0]);
		
	
		for (int i=0;i<a.length;i++) {
			int b=i+1;
			if(a[i]!=b) {
				System.out.println(b);
			
		}
		
	}
	}

}