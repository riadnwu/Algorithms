
public class QuickSort {

	private static int arr[] ={77,66,44,88,99,98,55,32,22};
	public static void main(String[] args) {

		int n=9,beg,end;
		beg=0;
		end=n-1;
		quick(beg,end);
		 for(int i=0;i<n;i++)
			{
				System.out.printf(" "+arr[i]);
			}
		
	}

	public static  void quick(int beg, int end) {
		int pibot;
		if(beg<end)
		{
			pibot=pi(beg,end);
			quick(beg,pibot-1);
			quick(pibot+1,end);
		}
		
		
	}

	public  static int pi(int beg, int end) {
		int left,right,piitem,swp;
		left=beg;
		right=end;
		piitem=arr[left];
		while(left<right)
		{
			while(arr[left]<=piitem)
			{
				left++;
			}
			while(arr[right]>piitem)
			{
				right--;
			}
			if(left<right)
			{
				swp=arr[left];
				arr[left]=arr[right];
				arr[right]=swp;
			}
		}
		arr[beg]=arr[right];
		arr[right]=piitem;
		return right;
	}

}
