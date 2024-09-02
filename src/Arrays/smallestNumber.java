package Arrays;

public class smallestNumber {

	public static void main(String[] args) 
	{
		int[] numArray = {56,87,45,98,34,90};
		int smallest=numArray[0];
		int length=numArray.length;
		System.out.println(length);
		System.out.println(numArray[1]);
		
		for(int i=1;i<length;i++)
		{
			if(numArray[i]<smallest) //87<56
			{
				smallest=numArray[i]; // 56
			}
		}
		
		System.out.println(smallest);
	}
	}