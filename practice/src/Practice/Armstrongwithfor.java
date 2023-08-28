package Practice;

public class Armstrongwithfor {
public static void armstring() {
	int n,sum=1,temp=0;
	//for(int i=1;i<=500;i++) {
		
		while(sum<=500) {
			int res=sum;
			n=res%10;
			res=res/10;
			temp+=n*n*n;
			sum++;
			
		}
		if(temp==sum) {
			System.out.println(temp+",");
		}
		
	}

	public static void main(String[] args) {
		Armstrongwithfor.armstring();
	}

}
////
