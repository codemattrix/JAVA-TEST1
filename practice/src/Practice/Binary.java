package Practice;

import java.util.Scanner;

public class Binary {
	String res1="";
	void binary(int a){
		while(a>0) {
			int res=a%2;
			a=a/2;
			res1=res+res1;
		}
		System.out.println(res1);
	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("pls enter the num for binary code:");
		int num=Sc.nextInt();
		Binary B1=new Binary();
		B1.binary(num);
	}

}
