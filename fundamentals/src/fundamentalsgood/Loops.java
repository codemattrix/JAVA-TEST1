package fundamentalsgood;

public class Loops {
	public static void sum() {
		int sum=0;
		for(int i=0;i<=10;i++) {
			
			sum+=i;
			
		}
		System.out.println("sum of the 10 natural num :"+sum);
	}

	public static void main(String[] args) {
		Loops.sum();
		// for loop is pre-check condition loop
			for(int i=0;i<=50;i++) {
				if(i%2==0) {
					System.out.print(i+",");
				}
				
			}
	}

}
