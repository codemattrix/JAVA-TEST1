package Practice;

import java.util.Scanner;

public class Factorial {
public static void fact(int num) {
	int res=num;
	for(int i=num-1;i>0;i--) {
		res*=i;
	}System.out.println("factorial of the given num : "+res);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num to find factorial :");
		int sel=sc.nextInt();
		Factorial.fact(sel);

	}

}
