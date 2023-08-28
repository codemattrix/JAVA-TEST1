package Practice;

import java.util.Scanner;

public class PoNeZeros {
public static void numbers( int num,Scanner obj) {
	int zero=0,posi=0,neg=0;
	for(int i=1;i<=num;i++) {
	System.out.println("enter the number "+i);
	int num1=obj.nextInt();
	if(num1>0) {
		posi++;
	}else if(num1<0) {
		neg++;
	}else {
		zero++;
	}
	}
	System.out.println("total Positive num: "+posi); 
	System.out.println("total Negative num: "+neg);
	System.out.println("total num of Zero's: "+zero);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of time to read input :");
		int num=sc.nextInt();
		PoNeZeros.numbers(num, sc);

	}

}
