package fundamentalsgood;

public class Variables {
	int a=10;
	long c=345L;
	float b=12.2342f;
	static int data= 120;
	public void m1() {
		int data=12;
		System.out.println(data);
	}

	public static void main(String[] args) {
		Variables obj=new Variables();
		System.out.println(obj.hashCode());
		System.out.println(obj.a);
		System.out.println(obj.c);
		System.out.println(obj.b);
		obj.m1();
		Variables obj1=new Variables();
		System.out.println(obj1.hashCode());
		System.out.println(Variables.data);
		//System.out.println(obj.data);
	}
}
