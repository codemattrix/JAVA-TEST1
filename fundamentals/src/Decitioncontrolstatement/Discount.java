package Decitioncontrolstatement;

import java.util.Scanner;

public class Discount {
	public static int totalcost(int a) {
		int res2=a*100;
		System.out.println("total cost :"+res2);
		if(res2>1000) return res2-(res2*10)/100;
		return res2;
	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("pls enter the num of units you want to purchase");
		int res=Sc.nextInt();
		int result=Discount.totalcost(res);
	System.out.println("after discount total amount :"+result);
	}

}
