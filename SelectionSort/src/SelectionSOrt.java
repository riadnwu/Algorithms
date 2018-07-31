
public class SelectionSOrt {

	public static void main(String[] args) {

		int arr[]={77,44,99,22,33,11,88,44,66};
		int loc,n=9;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			loc=i;
			for(int k =i+1;k<n;k++)
			{
				if(arr[k] < arr[loc])
				{
					loc=k;
				}
			}
			temp=arr[i];
			arr[i]=arr[loc];
			arr[loc]=temp;
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.printf(" "+arr[i]);
		}
		
	}

}
