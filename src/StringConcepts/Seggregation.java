package StringConcepts;

public class Seggregation {
	public static void main(String[] args) {
		String s="ab1n$h8oP34*F#";
		String number="";
		String alphabet="";
		String specialCharacter="";
		for(int i=0;i<s.length();i++)
		{
			 char ch = s.charAt(i);
			 if(ch>='0' && ch<='9')
				 number=number+ch;
			 else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				 alphabet+=ch;
			 else
				 specialCharacter+=ch;
		}
		System.out.println("Numbers : "+number);
		System.out.println("Alphabets : "+alphabet);
		System.out.println("Special characters: "+specialCharacter);
		
		
	}

}
