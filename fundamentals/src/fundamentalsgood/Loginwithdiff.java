package fundamentalsgood;

import java.util.Scanner;

public class Loginwithdiff {
static String name="ravish";
static String pass="anish@123";
public static void check(String nam,Scanner obj) {
	if (nam.equalsIgnoreCase(name)) {
		System.out.println("enter the password to login:");
//		Scanner sc=new Scanner(System.in);
		
		String pas=obj.next();
		if(pas.equals(pass)) {
			System.out.println("login succesfully");
		}else {
			System.out.println("entered password is wrong");
		}
	}else {
		System.out.println("user name is incorrect :");
	}
}
	public static void main(String[] args) {
		
		Scanner SC=new Scanner(System.in);
		System.out.println("enter your user-name and password:");
		String sel=SC.next();
		Loginwithdiff.check(sel,SC);
	}

}
