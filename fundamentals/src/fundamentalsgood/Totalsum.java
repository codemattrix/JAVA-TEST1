package fundamentalsgood;

import java.util.Scanner;

public class Totalsum {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int check=0;
	int sum=0;
	int count=-1;
	do {
		sum=sum+check;
		count++;
		System.out.println("pls enter the num to sum except -ve number");
		check=sc.nextInt();
	}while(check>0);
	System.out.println("sum of the num: "+sum);
	System.out.println(count+" number of +ve entered");
	}

}
