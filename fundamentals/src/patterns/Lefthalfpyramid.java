package patterns;

public class Lefthalfpyramid {
public static void leftpyra(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=i;j<=num-1;j++) {
			System.out.print("   ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(" * ");
		}
		System.out.println();
		}

}
	public static void main(String[] args) {
		Lefthalfpyramid.leftpyra(5);

	}

}
