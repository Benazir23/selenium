package Array;

public class Missingno {

	public static void main(String[] args) {
		int a[] = {1,2,4,3,5,6,8,9,10};
		int n=a.length+1;
		int sum= (n *(n+1))/2;
		for (int i=0;i<a.length;i++) {
			sum=sum - a[i];
			System.out.println(sum);
		}
			System.out.println("missing no is" + sum);
		

	}

}
