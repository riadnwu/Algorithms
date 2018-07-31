
public class maxMin {
	private static int max;
	private static int data[] = {9,-6,5,8,-7,5,4,2};
	private static int min;
	public static void main(String[] args) {;
     int beg=0,end=7;
     max=min=data[0];
     max_min(beg,end);
     System.out.printf("Max Number : %d\n Min Number :%d",max,min);
	}

	private static void max_min(int beg, int end) {
		int mid,max1,min1;
		if(beg == end)
		{
			max=min=data[0];
		}
		else if(beg == end-1)
		{
			if(data[beg]<data[end])
			{
				max =data[end];
				min=data[beg];
			}
			else
			{
				max =data[beg];
				min=data[end];
			}
		}
		else
		{
			mid = (beg+end)/2;
			max_min(beg,mid);
			max1=max;
			min1=min;
			max_min(mid+1,end);
			if(max<max1)
			{
				max=max1;
			}
			if(min>min1)
			{
				min=min1;
			}
		}
	}

}
