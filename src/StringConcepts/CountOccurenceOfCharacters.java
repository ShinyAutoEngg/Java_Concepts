package StringConcepts;

public class CountOccurenceOfCharacters {
	public static void main(String[] args) {
		String s = "ab123*dfYUJ89&";
		String upperCase = "";
		String lowerCase = "";
		String splChar = "";
		String number = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				number += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCase += ch;
			} else if (ch >= 'A' && ch <= 'Z') {
				upperCase += ch;
			} else {
				splChar += ch;
			}

		}
		System.out.println("Numbers : "+number);
		System.out.println("Uppercase : "+upperCase);
		System.out.println("Lowercase : "+lowerCase);
		System.out.println("Special characters: "+splChar);

	}

}
