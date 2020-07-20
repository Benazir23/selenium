import java.util.Scanner;



 public class test2 implements  test3 {
	public void attendence() {
		System.out.println("75");
	}	public void fees() {
		System.out.println("paid");
	}	public void exam() {
		System.out.println("passed");
	}	public void result() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the result");
		int a = sc.nextInt();
		if (a >= 75) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	}

	 public void revalutation() {
		 System.out.println("write the exam again");
	 }
		
	 public  static void main (String[]args) {
			
			test3 obj=new test2();
			obj.attendence();
			obj.fees();
			obj.exam();
			obj.result();
			obj.revalutation();
	 }


	
}
