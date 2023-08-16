package fundamentalsgood;

public class Constructors {
	
	 Constructors() {
		 this(10,21);
		System.out.println("default");
		//this();
	}

	 Constructors(int a){
		this();
		 System.out.println("parameter");
	 }
	 Constructors(int a,int b){
		 System.out.println("2 parameterized");
		
	 }
	public static void main(String[] args) {
		Constructors res=new Constructors(10);
		
	}

}
