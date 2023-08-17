package fundamentalsgood;

import java.util.Scanner;

public class Login {
	static final String na="ravish";
	static final String pa="anish@123";
	public static boolean login() {
		
	Scanner SC=new Scanner(System.in);
	System.out.println("enter the user name:");
	String name=SC.next();
	System.out.println("enter the user Password:");
	String pass=SC.next();
	if(name.equals(na)&&(pass.equals(pa))) {
		return true;
	}
	return false;
	}

	public static void main(String[] args) {
	String result=login()?"login success":"login failed";
	System.out.println(result);

	}

}
