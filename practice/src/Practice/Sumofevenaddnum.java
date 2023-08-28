package Practice;

public class Sumofevenaddnum {
	static int []arry= {12,13,14,15,16};
	public static void evennum() {
		int sum=0;
		for(int i=0;i<=arry.length-1;i++) {
			if(arry[i]%2==0) {
				sum+=arry[i];
			}	
		}System.out.println("the sum  of all even nums is: "+sum);
		
	}
	public static void oddnum() {
		int sum=0;
		for(int i=0;i<=arry.length-1;i++) {
			if(arry[i]%2==1) {
				sum+=arry[i];
			}
		}System.out.println("the sum of all add nums is : "+sum);
	}
	public static void main(String[] args) {
		Sumofevenaddnum.evennum();
		Sumofevenaddnum.oddnum();

	}

}
