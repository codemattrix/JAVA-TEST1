package Practice;

import java.util.Scanner;

public class Addition {
	static int sum=0;
	public static int addition(Scanner obj) {
		int num,num1;
		System.out.println("enter first num :");
		num=obj.nextInt();
		System.out.println("enter the second num to sum :");
		num1=obj.nextInt();
		sum+=num+num1;
		return sum;}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		char a;
		int result;
	do {
		result=addition(sc);
		System.out.println("sum of the two num is : "+result);
		System.out.println("would you like to perform the operation again");
		a=sc.next().charAt(0);
	}while(a=='y');
	System.out.println("operation terminated");
	}

}
