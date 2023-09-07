package Practice;

public class Armstrongwithfor {
public static void armstring() {
	int n,temp=0,res,i=1;
	while(i<=500) {
		res=i;
	while(res!=0) {
		n=res%10;
		temp=temp+(n*n*n);
		res=res/10;	
	}
		if(temp==i) System.out.print(temp+",");	
		i++;	
	}	
		
	}

	public static void main(String[] args) {
		Armstrongwithfor.armstring();
	}

}
////
