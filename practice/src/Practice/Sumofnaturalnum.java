package Practice;

import java.util.Scanner;

public class Sumofnaturalnum {
	static int sum=0;
public static int sumofnum(int num) {
	for(int i=1;i<=num;i++) {
		sum+=i;
	}return sum;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the N natural num to find sum :");
		int num=sc.nextInt();
		int result=Sumofnaturalnum.sumofnum(num);
		System.out.println("sum of all N natual num of "+num+" is : "+result);
	}

}
