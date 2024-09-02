
package StringConcepts;

public class AddNumbersInAString {
	public static void main(String[] args) {
		String s="ab1n$h8oP34*F#";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				sum=sum+ch-'0';
		}
		System.out.println("Sum is "+sum);
		
	}

}
//String s="ab1n$h8oP34*F#";
//String ss=s.replaceAll("[^0-9]","");
//int sum=0;
//char ch[]=ss.toCharArray();
//for(char c : ch)
//{
//	sum=sum+c-'0';
//}
//System.out.println(sum);