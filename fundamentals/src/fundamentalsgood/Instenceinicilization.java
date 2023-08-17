package fundamentalsgood;

public class Instenceinicilization {
	
	public Instenceinicilization() {
		System.out.println("constructor exicution");
	}
	
	// it will catch first by constructor before it content exicution
	{
		System.out.println("block exicution");
	}
	static {
		System.out.println("static");
	}

	public static void main(String[] args) {
		Instenceinicilization obj=new Instenceinicilization();
	}

}
