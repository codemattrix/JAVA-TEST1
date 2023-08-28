package fundamentalsgood;

public class Reversenum {
public static void revers(int num) {
	int q=0,rem=0;
	int temp=num;
	while(num!=0) {
		rem=num%10;
		num=num/10;
		q=q*10+rem;
		
	}System.out.print(q);
}
	public static void main(String[] args) {
		int a=4567;
		Reversenum.revers(a);
	}

}
