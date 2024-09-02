package StringConcepts;

public class CompressString {
	public static void main(String[] args) {
		String s = "aahhuuurecswqq";
	
		int i, count = 1;
		String res = "";
		for (i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1))
				count++;
			else {
				res = res + s.charAt(i) + count;
				count = 1;
			}
		}

		if (i == s.length() - 1) {
			res = res + s.charAt(i) + count;
		}
		System.out.println(res);
	}


}
