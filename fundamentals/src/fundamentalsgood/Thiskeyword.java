package fundamentalsgood;

class Shape{
	Shape(){
		System.out.println("value of THis :"+this.hashCode());
	}
}
public class Thiskeyword {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape S1=new Shape();
		System.out.println(S1.hashCode());
		Shape S2=new Shape();
		System.out.println(S2.hashCode());

	}

}
