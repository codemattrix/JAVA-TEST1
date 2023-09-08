package Test.programs;

public class Program1 {
	public static boolean palendrom(int num) {
		int res=0,temp;
		boolean flag=false;
		while(num!=0) {
			temp=num%10;
			res=res*10+temp;
			num=num/10;
			if(res==num) {
				//System.out.println("palendrom");
				flag=true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int num =1221;
	boolean check=Program1.palendrom(num);
System.out.println("the given num is palindrom ? "+check);
	}

}
