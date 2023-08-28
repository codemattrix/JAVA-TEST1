package Practice;
public class LargeandMinnum {
	static int []arry= {22,21,24,23,54,8};
	public static void large() {
		int max=arry[0];
		for(int i=1;i<arry.length;i++) {
			if(max<arry[i]) {
				max=arry[i];
			}
		}System.out.println("maximum num of the given array is : "+max);
	}
	public static void smaller() {
		int min=arry[0];
		for(int i=1;i<arry.length;i++) {
			if(min>arry[i]) {
				min=arry[i];
			}
		}	System.out.println("minimum num of the given array is : "+min);
	}

	public static void main(String[] args) {
		LargeandMinnum.large();
		LargeandMinnum.smaller();
	}

}
