package Practice;

import java.util.Scanner;

public class Multiplication {
	public static void mul(int a) {
		int res=0;
		for(int i=1;i<=10;i++) {
			res=a*i;
			System.out.println(a+"*"+i+"="+res);
		}
	}
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("pls enter num to see multiplication table of that number : ");
		int sel=SC.nextInt();
		Multiplication.mul(sel);

	}

}
