package Array;

public class vowelcount {

	public static void main(String[] args) {

		String a = "welcome";
		int count = 0;
		int count1 = 0;

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;

			} else{
				count1++;
			}

		}
		System.out.println("vowel count is " + count);
		System.out.println("not vowel count is " + count1);

	}

}
