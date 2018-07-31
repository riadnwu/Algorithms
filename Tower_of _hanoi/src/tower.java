import java.util.Scanner;


public class tower extends tower2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n;
		char a='A';
		char b='B';
		char c='C';
		System.out.print("How Many Diisk:");
		n=input.nextInt();
		tower obj=new tower();
		obj.tower1(n,a,b,c);

	}

}
