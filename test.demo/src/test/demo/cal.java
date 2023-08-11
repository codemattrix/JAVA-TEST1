package test.demo;

public class cal {
	int num1;
	int num2;
	int n=1;
	public void calculater(int n1,int n2)
	{
		this.num1=n1;
		this.num2=n2;
		System.out.println(+num1+num2);
	}
	public static void main(String args[]) {
	cal str=new cal();
	str.calculater(2,9);
	}
//	switch(n) {
//	case1:
//		System.out.println("num1 + num2:"+num1+num2);
//		break;
//	case2:
//		System.out.println("num1*num2:"+num1*num2);
//		break;
//	default:
//		System.out.println("this is out of range");
//	}
		
}
