package Practice;

public class Numdisplay {
public static void printnum() {
	for(int i=0;i<=10;i++) {
		if(i<=9) {
			System.out.print(i+",");
		}else {
			System.out.println(i);
		}
		
	}
}
	public static void main(String[] args) {
	Numdisplay.printnum();

	}

}
