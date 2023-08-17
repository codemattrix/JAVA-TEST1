package fundamentalsgood;

import java.util.Scanner;

public class Airthametic {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
//		System.out.println("pls enter the first num:");
//		int a=SC.nextInt();
//		System.out.println("pls enter the second num:");
//		int b=SC.nextInt();
//		System.out.println("addition: "+ (a+b));
//		System.out.println("Subtraction: "+ (a-b));
//		System.out.println("division: "+ (a/b));
//		System.out.println("Module: "+ (a%b));
		
		
		//unary operator(++,--,~(convert to 1's compliment))
//		
//		int c=10;
//		int d=c++;
//		System.out.println(c+" "+d);
//		
//		
//		//relational
//		int x=10;
//		int y=12;
//		System.out.println(x==y);
//		
//		//logical
//		System.out.println(!((x>y)||(!(x<y))));
//		
//		//assignment
//		int m=10;
//		int n=20;
//		m=n;
//		System.out.println(m+"  "+n);
//		
//		//ternary
//		int data=100;
//		int num=200;
//		String res=(data<num)?"success":"failure";
		
//		System.out.println(res);
//		System.out.println("enter the user name");
//		String name=SC.next();
//		System.out.println("enter the pass");
//		String pass=SC.next();
//		String result=(name.equals("ravish") && pass.equals("Ambuja@123"))? "Login success":"Login Failure";
//				
//		System.out.println(result);
		
		//bitwise  (&,|,^(if the value is diff then return true))
		
		System.out.println(10<<2);
		System.out.println(20>>2);
		
		//instance of
		
		Airthametic AT=new Airthametic();
		System.out.println(AT instanceof Airthametic);
	}
}
