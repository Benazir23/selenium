package String;

public class string_ex1 {

	public static void main(String[] args) {

		String a = "1234(234)";

		String w = a.replace(")", "");
		String b = w.replace("(", " ");

		String d = b.substring(0, 4);
		String f = b.substring(5, 8);

		System.out.println(d);
		System.out.println(f);

	}

}
