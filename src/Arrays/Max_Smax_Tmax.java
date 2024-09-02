package Arrays;

public class Max_Smax_Tmax 
{
	public static void main(String[] args) 
	{
        int[] a={3,5,11,2,1,33,45,22};
        
        int max=a[0];
        int smax=a[0];
        int tmax=a[0];
        
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
                tmax=smax;
                smax=max;
                max=a[i];
            }
            if(smax<a[i] && max!=a[i])
            {
                tmax=smax;
                smax=a[i];
            }
            if(tmax<a[i]  && max!=a[i]  && smax!=a[i])
            {
                tmax=a[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        System.out.println(tmax);
	}
}
