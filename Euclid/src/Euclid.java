import java.util.Scanner;


public class Euclid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double x;
		Double y;
		Double z;
		Scanner input=new Scanner(System.in);
		Euclid1 obj =new Euclid1();
		System.out.print("Enter Your First Number :");
		x=input.nextDouble();
		System.out.print("Enter Your Second Number :");
		y=input.nextDouble();
		z=obj.Eucl(x, y);
		System.out.printf("Your Solution Is :%2.2f",z);
		
		
	}

	
}
