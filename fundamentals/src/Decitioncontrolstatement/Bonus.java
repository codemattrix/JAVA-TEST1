package Decitioncontrolstatement;

import java.util.Scanner;

public class Bonus {
	public static int salary(int a,int b) {
		if(b>5) {
			int bon=(a*5)/100;
			return bon;
		} 
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary :");
		int salary=sc.nextInt();
		System.out.println("enter the year of exp : ");
		int year=sc.nextInt();
		int res=Bonus.salary(salary, year);
		System.out.println("net Bonus amount is :"+res);
	}

}
