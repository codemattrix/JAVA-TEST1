package fundamentalsgood;

public class Exp {
	int a;
	Exp(){
		a=30;
	}
	void show() {
		int a=23;
		System.out.println(this.a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		Exp e1=new Exp();
		e1.show();
		
	}

}
