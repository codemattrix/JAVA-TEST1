package patterns;

public class Halfpyramid {
public static void half(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" * ");
		}System.out.println();
	}
}
	public static void main(String[] args) {
		Halfpyramid.half(5);

	}

}
