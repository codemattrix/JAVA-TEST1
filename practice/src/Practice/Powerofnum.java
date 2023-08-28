package Practice;

import java.util.Scanner;

public class Powerofnum {
public static void power(int num,int num1) {
	int res=num;
	for(int i=2;i<=num1;i++) {
		res*=num;
	}System.out.println(num+" power of "+num1+" is: "+res);
	
}
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("enter the num to find power :");
		int num=SC.nextInt();
		System.out.print("enter the power of num :");
		int pow=SC.nextInt();
		Powerofnum.power(num, pow);

	}

}
