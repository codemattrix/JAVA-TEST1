package Practice;

import java.util.Scanner;

public class Randomnum {
public static void randem(int max,int min,Scanner obj) {
	int num=0;
	int b = (int)(Math.random()*(max-min+1)+min);
	while(num!=b) {
		System.out.println("geuss a num between "+min+" and "+max);
		num=obj.nextInt();
		 if(num>b) {
			System.out.println("Too high, try again.");
			
		}else if(num<b){
			System.out.println("Too low, try again.");
			
		}else {
			System.out.println("given num is :"+num+" matching with random num :"+b);
//			correct =true;
			break;
		}
		
	}
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the max num :");
		int max=sc.nextInt();
		System.out.println("enter the min num :");
		int min=sc.nextInt();
//		System.out.println("enter the num to match :");
//		int match=sc.nextInt();
		Randomnum.randem(max,min,sc);

	}

}
