package InterviewQuestions;

public class array_averageofnos {

	public static void main(String[] args) {

		int myarray[] = { 1, 3, 8, 5, 6};
		int temp = 0;
		int average;
		for (int i = 0; i < myarray.length; i++) {
			temp = temp + myarray[i];

		}
		System.out.println(temp);
		average=temp/myarray.length;
System.out.println(average);
	}

}
