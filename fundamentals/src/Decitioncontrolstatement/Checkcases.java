package Decitioncontrolstatement;

import java.util.Scanner;

public class Checkcases {
	public static void check(char a) {
		if(a>='A' && a<='Z') {
			System.out.println("the given char is Uppercase");
		}else if(a>='a' &&a<='z') {
			System.out.println("the given cahr is lowercase");
		}else {
			System.out.println("check your input is other than char");
		}
		
	}

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("enter the char to check whether lowercase or uppercase");
		char res=SC.next().charAt(0);
		Checkcases.check(res);
	}

}
