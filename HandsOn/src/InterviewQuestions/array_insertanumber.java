package InterviewQuestions;

import java.util.Arrays;

public class array_insertanumber {

	public static void main(String[] args) {

		 int[] my_array = {25, 14, 56, 15, 36};

		    // Insert an element in 3rd position of the array (index->2, value->5)
		   
		   int position = 2;
		   int newValue    = 5;

		  //System.out.println("Original Array : "+Arrays.toString(my_array));     
		   
		  for(int i=my_array.length-1; i > position; i--){
		    my_array[i] = my_array[i-1];
		   }
		   my_array[position] = newValue;
		   System.out.println("New Array: "+Arrays.toString(my_array));
		}
	}


