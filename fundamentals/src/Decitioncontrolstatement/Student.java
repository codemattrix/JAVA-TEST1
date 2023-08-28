package Decitioncontrolstatement;

import java.util.Scanner;

public class Student {
	public static int eligible(int a,int b) {
		if(b>(a*75)/100) {
			System.out.println("eligible for exam");
			return (b*100/a);
		}else {
			System.out.println("not eligible for exam");
			int res=(b*100/a);
			return res;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("total class held :");
		int Tocal=sc.nextInt();
		System.out.println("total attended class : ");
		int Toatt=sc.nextInt();
		int res=Student.eligible(Tocal, Toatt);
		System.out.println("total percentage of class attended :"+res+"%");
	}

}
