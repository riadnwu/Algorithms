
public class InsertionSort {

	public static void main(String[] args) {
    int arr[]={77,88,33,22,66,99,11,25};
    int n=8,swp;

    for(int i=1;i<n;i++ )
    {
       for(int j=i-1;j>=0;j--)
       {
    	  if(arr[j]>arr[j+1])
    	  {
    		 swp= arr[j];
    		 arr[j]=arr[j+1];
    		 arr[j+1]=swp;
    	  }
       }
       
    }
    for(int i=0;i<n;i++)
	{
		System.out.printf(" "+arr[i]);
	}
	}

}
