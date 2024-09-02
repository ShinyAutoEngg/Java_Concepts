package StringConcepts;

import java.util.Arrays;

public class Anagram1 {
	public static void main(String[] args) {
		String s1 = "Pot";
		String s2 = "top";
		boolean flag = true;
		if (s1.length() != s1.length()) {
			System.out.println("Its not Anagram");
			return;
		} else {
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = false;
					System.out.println("Its not anagram");
					break;
				}

			}

		}
		if (flag) {
			System.out.println("Its anagram");
		}

	}

}
