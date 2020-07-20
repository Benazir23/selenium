package abstraction;

import java.util.Scanner;

 public class test2 extends test1 {

	public void result() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the result");
		int a = sc.nextInt();
		if (a >= 75) {
			System.out.println("passed");
		} else {

			System.out.println("failed");

		}

	}

	public static void main(String[] args) {
		

		test1 obj = new test2();
		obj.attendence();
		obj.lab();
		test1.fees();
		obj.exam();
		obj.result();

	}

}
