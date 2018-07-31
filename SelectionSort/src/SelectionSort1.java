
public class SelectionSort1 {

	public static void main(String[] args) {
 int arr[]={77,88,55,44,66,99,11,22};
 int n=8,min,loc,swp;
 for(int i=0;i<n;i++)
 {
	 min=arr[i];
     loc=i;
	 for(int j=i+1;j<n;j++)
	 {
		 if(arr[j]<min)
		 {
			 min=arr[j];
			 loc=j;
		 }
	 }
	 
	 swp=arr[loc];
	 arr[loc]=arr[i];
	 arr[i]=swp;
 }
 for(int i=0;i<n;i++)
	{
		System.out.printf(" "+arr[i]);
	}
}

}
