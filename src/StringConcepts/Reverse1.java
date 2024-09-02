package StringConcepts;

public class Reverse1 {
	public static void main(String[] args) {
		String s = "Chennai";

		String rev = "";
		for (char ch : s.toCharArray()) {
			rev = ch + rev;

		}
		System.out.println(rev);
	}

}
