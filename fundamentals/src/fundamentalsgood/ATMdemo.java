package fundamentalsgood;

import java.util.Scanner;

public class ATMdemo {
	static char sel;
	public static void m1() {
		System.out.println("function ______-----");
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	do {
		m1();
		System.out.println("do you want continue :");
		sel=sc.next().charAt(0);
	}while(sel=='y');
	System.out.println("thanking you");
	}

}
