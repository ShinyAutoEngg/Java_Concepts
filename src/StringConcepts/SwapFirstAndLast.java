package StringConcepts;

public class SwapFirstAndLast {
	public static void main(String[] args) {
		String s=" I am from Chennai";
		String[] str=s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		
		str[str.length-1]=temp;
		for(String e : str) {
		System.out.print(e+" ");
		
		}	
	
		}
	}



