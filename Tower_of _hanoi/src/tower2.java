
public class tower2 {

	private int i=1;
	public  void tower1(int n,char a,char b,char c )
	{  
		if(n==1)
		{
			System.out.printf(" \n %d. %c => %c  ",i,a,c);
			i++;
			return;
		}
		tower1( n-1, a,c,b );
	    System.out.printf(" \n %d. %c => %c  ",i,a,c);
		i++;
		tower1( n-1, b,a,c );
		return;
	}
}
