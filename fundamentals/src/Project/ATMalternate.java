package Project;

import java.util.Scanner;

public class ATMalternate {
	static int pin=0;
	static int savepin=4565;
	static int bal=500;
	static int currentbal=bal;
	public static void withdraw(Scanner obj) {
		System.out.println("enter the amount to  withdraw");
		int with=obj.nextInt();
		if(currentbal-bal>=with) {
			currentbal-=with;
			System.out.println("withdraw of Rs"+with+" is successfull");
		}else {
			System.out.println("insufficient bal");
		}
	}
	public static void deposit(Scanner obj) {
		System.out.println("pls enter amount to deposit:");
		int depo=obj.nextInt();
		currentbal+=depo;
		System.out.println("deposit amount:"+depo+"is successfull");
	}
	public static void balEnquiry() {
		System.out.println("your current bal is:"+currentbal);
	}

	public static void main(String[] args) {
		int i=1;
		
		System.out.println("Welcome to SBI ATM");
		do {
		System.out.println("please enter your pin :");
		Scanner sc=new Scanner(System.in);
		 pin=sc.nextInt();
		char sel;
		
		
			if(pin==savepin) {
				do {
					System.out.println("pls choose your option :");
					System.out.println("1)withdraw   2)deposit  3)balEnquiry");
					int choice=sc.nextInt();
					switch(choice) {
					case 1:withdraw(sc);
							break;
					case 2:deposit(sc);
							break;
					case 3:balEnquiry();
							break;
					default:System.out.println("you entered wrong option");
					}
					System.out.println("do you want to continue:");
					sel=sc.next().charAt(0);
				}while(sel=='y');
				System.out.println("thank you for visit SBI ATM :keep visiting");
		}
			else if(i==3) {
				System.out.println("your attempt of limitation is compited pls try agian tommorow");
				break;
			}
			else {
			System.out.println("you entered wrong password");
			System.out.println("your attempt of limitation still "+(3-i));
		}i++;
		System.out.println("whould you like to continue again");
		char yes=sc.next().charAt(0);
		if(yes=='y') {
			System.out.println("pls enter pin");
			pin=sc.nextInt();
		}
		}while(i>3);
		
	}
		
}
