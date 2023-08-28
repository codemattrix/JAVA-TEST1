package patterns;

public class Downlefttriangle {
public static void triangle(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=2;j<=i;j++) {
			System.out.print("   ");
			}
		for(int k=i;k<=num;k++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Downlefttriangle.triangle(5);

	}

}
