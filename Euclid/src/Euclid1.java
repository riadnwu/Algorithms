
public class Euclid1 {
	private static double temp;
	public static double Eucl(double x,double y)
	{
		
		if(y==0)
		{
			return x;
		}
		else
		{
			while(x%y !=0)
			{
				
					temp=x%y;
					x = y;
					y=temp;
			}
			return y;
		}
		
	}
	
	
}
