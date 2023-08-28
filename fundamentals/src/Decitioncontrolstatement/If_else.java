package Decitioncontrolstatement;

import java.util.Scanner;

public class If_else {
//	public static void check(int a,int b) {
//	
//		if(a>b) {
//			System.out.println(a+" is the first value be the greter than second");
//		}else {
//			System.out.println(b+" is the second value be the greter than first");
//		}
//	}
	
	public static int check(int a,int b) {
		if(a>b) return a;
		return b;
	}

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("enter your input first value");
		int res=SC.nextInt();
		System.out.println("enter the second value ");
		int res1=SC.nextInt();
		int res2=If_else.check(res,res1);
		System.out.println(res2+" is greater number");
//		if(res>20) {
//			System.out.println("the given num is greater than condition");
//		}else {
//			System.out.println("the given num is lesser than given condition");
//		}
		
	}

}
