package fundamentalsgood;

public class Countofone {
public static void count(int num) {
	int res=0;
	int count=0;
	while(num!=0) {
		res=num%10;
		num=num/10;
		if(res==1) {
			count++;	
		}
	}System.out.println(count);
}
	public static void main(String[] args) {
		Countofone.count(1121314);
	}

}
