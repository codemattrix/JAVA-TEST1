package fundamentalsgood;

public class Student {
	int id=1;
	String name="ravish";
	static String College="BGSIT";
	public void student() {
		
		System.out.println("Id of the student:"+id+"\n Name:"+name+" \n college:"+Student.College);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.student();
		

	}

}
