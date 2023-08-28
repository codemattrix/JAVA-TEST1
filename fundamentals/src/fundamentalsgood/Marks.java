package fundamentalsgood;

import java.util.Scanner;

public class Marks {
	public static void check(int num) {
		if (num>=80) {
			System.out.println("disticntion");
		}else if (num>=60 && num<=79) {
			System.out.println("first-class");
		}else if (num>=35 && num<=59) {
			System.out.println("second-class");
		}else {
			System.out.println("you are failed");
		}
	}

	public static void main(String[] args) {
		
		Scanner SC=new Scanner(System.in);
		System.out.println("enter the marks to check :");
		int mark=SC.nextInt();
		Marks.check(mark);
	}

}
