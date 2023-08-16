package fundamentalsgood;

import java.util.Scanner;

public class Userinput {
	int princi;
	int time;
	float rate;
	Userinput(int princi,int time,float rate){
		
		this.princi=princi;
		this.time=time;
		this.rate=rate;
		
	}
	 public float calculate() {
		 return (this.princi*this.time*this.rate)/100;
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount");
		int pri=sc.nextInt();
		System.out.println("enter the time \n");
		int Ti=sc.nextInt();
		System.out.println("enter the rate of interest \n");
		float Roi=sc.nextFloat();
		Userinput UI=new Userinput(pri,Ti,Roi);
		float res=UI.calculate();
		System.out.println("Intrest for the period of "+Ti+" yrs =  "+res);
		}

}
