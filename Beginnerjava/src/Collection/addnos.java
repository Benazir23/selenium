package Collection;

import java.util.*;

public class addnos {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(4);
		a.add(7);
		a.add(6);
		a.add(5);
		a.add(2);
		a.add(4);
		a.add(7);
		int j=0;
		
		for (int i=0;i<a.size();i++) {
			
			j=j+a.get(i);
			
		
		}System.out.println(j);

	}

}