import java.util.Scanner;
public class Max_Min {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,max,min;
		 int data[]=new int[100];
		int beg,end;
       Max_Min_1 obj =new Max_Min_1() ;
       Scanner input=new Scanner(System.in);
       System.out.print("How Many Number :");
       n=input.nextInt();
       for(int i =0 ;i < n ; i ++)
       {
    	  System.out.print(i+1+" Enter Your Number :");
    	  data[i] = input.nextInt();
       }
       max=min=data[0];
       beg=0;
       end=n-1;
       obj.  maxmin ( data,beg, end,max,min);
      max =obj.value1();
      min=obj.value2();
 	  System.out.printf("max:%d,\n min:%d",max,min);
    
	}

}
