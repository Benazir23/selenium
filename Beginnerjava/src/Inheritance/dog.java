package Inheritance;

public class dog extends Animal{
	
	static int a=10;
	
	public  int add(int a, int b ) {
		 int c=a+b+10;
		
		return c;
	
			}

	public  int sub(int a,int b) {
		
		int c=a-b+20;
		return c;
	
	}
	void test() {
		System.out.println("child testing");
	}
	public static void main(String[] args) {
		
		Animal obj=new Animal();
		obj.test();
	}
}
