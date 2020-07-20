package Inheritance;

public class babydog extends dog {

	public int add(int a, int b) {
		int c = a + b + 20;
		System.out.println(c);
		return c;

	}
	void display() {
		System.out.println(super.add(10, 10));
	}
	
	public static void main(String[] args) {
		babydog obj=new babydog();
		System.out.println(obj.add(10,10));
		
		
		
				
	}

}
