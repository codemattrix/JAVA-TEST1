package Practice;

import java.util.Scanner;

public class Upperandlower {
	public static void checkcase(int b) {
		if(b>=65&&b<=90) {
		System.out.println("the entered charector is Uppercase");
		}else if(b>=97&&b<=122) {
			System.out.println("the entered charector is Lowercase");
		}else {
			System.out.println("pls check your input");
		}
		
	}

	public static void main(String[] args) {
	System.out.print("enter the charector to find lower or Uppercase : ");
	Scanner SC=new Scanner(System.in);
	int a=SC.next().charAt(0);
	Upperandlower.checkcase(a);

	}

}
