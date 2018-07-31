
public class Max_Min_1 {
private static int  max,min;
	
public int value1()
{
	return max;
}
public int value2()
{
	return min;
}

public static  void maxmin (int data[],int beg,int end,int max2,int min2)
{  
    max=max2;
    min=min2;
	int mid,max1,min1;
	{
		if(beg==end)
		{
		   max=min=data[beg];
		}
		else if(beg == end -1)
		{
			if(data[beg]<data[end])
			{
				max=data[end];
				min = data [beg];
				
			}
			else
			{
				max=data[beg];
				min = data [end];
			}
		}
		else
		{
			mid =(beg+end)/2;
			 maxmin (data,beg,mid,max,min);
			max1=max;
			min1= min;
			 maxmin (data,mid+1,end,max1,min1);
			if(max < max1)
			{
				max=max1;
			}
			if(min>min1)
			{
				min =min1;
			}
			
		}
	}
	
	
}
}
