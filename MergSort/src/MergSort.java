import java.util.Scanner;


public class MergSort {
    public static int arr[];
	private Scanner in;
	public MergSort() {
		int beg,end;
		in = new Scanner(System.in);
		System.out.print("How many number :");
		arr=new int[in.nextInt()];
		for(int i = 0;i<arr.length;i++)
		{
			System.out.printf(i+1+" Arra[%d] :",i);
			arr[i]=in.nextInt();
		}
		beg = 0;
		end = arr.length-1;
		Merg(beg,end);
		System.out.print("\t***Sorted Date***\n");
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(" "+arr[x]);
		}
		
	}
	private void Merg(int beg, int end) {
		int mid;
		if(beg < end )
		{
			mid = (beg+end)/2;
			Merg(beg,mid);	
			Merg(mid+1,end);
			mergSort(beg,mid,end);
		}
		
	}
	private void mergSort(int beg, int mid, int end) {
		int temp[] =new int[100];
		int j=beg,k=mid+1,l;
		int i=beg;
		while(j<=mid && k<=end)
		{
			if(arr[j] <= arr[k])
			{
				temp[i]=arr[j];
				j++;
			}
			else
			{
				temp[i]=arr[k];
				k++;
			}
			i++;
		}
		if(j > mid)
		{
			for(l=k;l<=end;l++)
			{
				temp[i] = arr[l];
				i++;
			}
			
		}
		else
		{
			for(l=j;l<=mid;l++)
			{
				temp[i]=arr[l];
				i++;
			}
		}
		for(l=beg;l<=end;l++)
		{
			arr[l]=temp[l];
		}
	}
	public static void main(String[] args) {
       new MergSort();
	}

}
