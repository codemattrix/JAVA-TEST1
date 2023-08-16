package fundamentalsgood;

public class Case1 {
	int a=100;
	
	public void display() {
		System.out.println(this.a);
	}
	void caller(){
	this.display();	
	}
	public static void main(String[] args) {
		
		Case1 s=new Case1();
		s.caller();
	}

}
