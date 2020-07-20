package Collection;

import java.util.*;

public class summation10 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		int sum = 10;

		int b;
		for (int i = 0; i < a.size();  i++) {
			for (int j = 0; j < a.size(); j++) {
				b = a.get(i) + a.get(j);
				if (b == sum) {
System.out.println("summation is 10 and index values are " + a.get(j) + " " + a.get(i));
				}
		}
			

		}

	}

}
