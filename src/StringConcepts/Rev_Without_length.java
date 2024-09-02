

package StringConcepts;

public class Rev_Without_length {
	public static void main(String[] args) {
		String s = "Chennai";
		String rev = "";
		int i = 0;
		while (true) {
			try {
				char ch = s.charAt(i);
				rev = ch + rev;
				i++;
			} catch (StringIndexOutOfBoundsException e) {
				break;

			}

		}
		System.out.println(rev);

	}

}
