package Practice;

import java.util.Scanner;

public class Reverse {
public static void reverse(int num) {
	int res=0,temp=0;
	while(num!=0) {
		temp=num%10;
		num=num/10;
		res=res*10+temp;
	}
	System.out.println(res);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num to reverse it");
		int num=sc.nextInt();
		Reverse.reverse(num);

	}

}
