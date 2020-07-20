package InterviewQuestions;

public class Array_max_min_value {
	public static int getMinValue(int[] numbers) {
		int minvalue = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minvalue) {
				minvalue = numbers[i];
						}
		}return minvalue;
	}

	public static void main(String[] args) {

		int [] a= {6,2,5,10,3};
		int high=0;
		int low=1;
		//Highest
		for (int i=0;i <a.length;i++) {
			if(a[i]>high) {
				high=a[i];
			
			}
		}
	System.out.println("Highest value is " +high);
		System.out.println(Array_max_min_value.getMinValue(a));
	}
	}