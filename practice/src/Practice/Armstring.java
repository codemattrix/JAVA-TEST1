package Practice;

import java.util.Scanner;

public class Armstring {
public static void armstring(int num) {
	int temp=num;
	int result=0;
	while(num>0) {
		int res=num%10;
		num=num/10;
		result+=res*res*res;
	}
	
	
	if(result==temp) {
		System.out.println("the given num is armstrong num :"+result);
	}else{
		System.out.println("the given num is not an armstrong");
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num to find armstring of the num");
		int num=sc.nextInt();
		Armstring.armstring(num);
	}

}
