package Project;

import java.util.Scanner;

public class ATM {
static int savepin=4565;
static int bal=500;
static int currentbal=bal;

public static void withdraw(Scanner obj) {
	System.out.println("enter the amount to withdraw");
	int withdraw=obj.nextInt();
	int balenq=balEnquiry();
	if((currentbal-bal) <  withdraw) {
		System.out.println("insufficient balence");
	}else {
		currentbal-=withdraw;
		System.out.println("Amount"+withdraw+" deducted successfully");
	}
}
public static int deposit(Scanner obj) {
	System.out.println("pls enter the amount to deposit");
	int deposit=obj.nextInt();
	currentbal+=deposit;
	System.out.println("deposit successfull");
	return bal;
}

public static int balEnquiry() {
	return currentbal;
}

	public static void main(String[] args) {
		System.out.println("Welcome to SBI bank ATM");
		System.out.println("pls enter your pin number :");
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		char input;
		if(pin==ATM.savepin) {
			do {
				System.out.println("select operation:(enter with there reference number)");
				System.out.println("1)withdraw  2)deposit  3)balEnquiry");
				int data=sc.nextInt();
				switch(data) {
				case 1:withdraw(sc);
						break;
				case 2:deposit(sc);
						break;
				case 3:int bal=balEnquiry();
				System.out.println("current bal : "+bal);
						break;
				default:System.out.println("invalid option");
				
				}
				System.out.println("do you want to continue?");
				input=sc.next().charAt(0);
			}while(input=='y');
			
			System.out.println("thanks for using SBI ATM-keep visiting");
		}
		
	}

}
