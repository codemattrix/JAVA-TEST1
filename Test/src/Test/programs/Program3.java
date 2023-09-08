package Test.programs;

public class Program3 {
	public static int factorial(int num) {
		for(int i=num-1;i>0;i--) {
			num*=i;
		}
		return num;
	}
	public static void main(String[] args) {
		int num =5;
		int result=Program3.factorial(num);
		System.out.println("factorial of 5 is :"+result);
	}

}
