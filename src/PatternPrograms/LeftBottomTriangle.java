package PatternPrograms;

public class LeftBottomTriangle 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)       //for(int j=1;j<=i;j++)
			{
				if(i>=j)                 //if you use the above... dont use the below
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
