package Test.programs;

public class Program2 {
public static int armstrong(int num) {
	int res=0,temp;
	//boolean flag=false;
	while(num!=0) {
		temp=num%10;
		num=num/10;
		res=res+(temp*temp*temp);
		
	}
	return res;
}
	public static void main(String[] args) {
		int num=153;
		int result=Program2.armstrong(num);
		if(result==num) {
			System.out.println("the given num :"+num+" is Armstrong num");
		}else {
			System.out.println("the given num is not an armstrong");
		}

	}

}
