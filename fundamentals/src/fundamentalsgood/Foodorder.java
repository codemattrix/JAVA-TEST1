package fundamentalsgood;

import java.util.Scanner;

public class Foodorder {
	public static String[] table1() {
		Scanner SC=new Scanner(System.in);
		String [] arr= {"curd-rice","south-meals","Poori","Chapathi"};
	for (String string : arr) {
		System.out.println(string+" ");
	}
	System.out.println("pls select the item which you prefer");
	String sel=SC.next();
	System.out.println("do you want any more item"+":: yes/no");
	String sel1=SC.next();
	String sel2="";
	if(sel1.equals("yes")) {
		System.out.println("select your next item");
		 sel2=SC.next();
	}else {
		System.out.println("no need this is enough");
	}
	String []arry= {sel,sel2};
	return arry;
	}
	
	public static String[] table2() {
		Scanner SC=new Scanner(System.in);
		String [] arr= {"curd-rice","south-meals","Poori","Chapathi"};
		for (String string : arr) {
			System.out.println(string+" ");
		}
	System.out.println("pls select the item which you prefer");
	String sel=SC.next();
	System.out.println("do you want any more item"+":: yes/no");
	String sel1=SC.next();
	String sel2="";
	if(sel1.equals("yes")) {
		System.out.println("select your next item");
		 sel2=SC.next();
	}else {
		System.out.println("no need this is enough");
	}
	String []arry= {sel,sel2};
	return arry;
	}
	public static String[] table3() {
		Scanner SC=new Scanner(System.in);
		String [] arr= {"curd-rice","south-meals","Poori","Chapathi"};
		for (String string : arr) {
			System.out.println(string+" ");
		}
	System.out.println("pls select the item which you prefer");
	String sel=SC.next();
	System.out.println("do you want any more item"+":: yes/no");
	String sel1=SC.next();
	String sel2="";
	if(sel1.equals("yes")) {
		System.out.println("select your next item");
		 sel2=SC.next();
	}else {
		System.out.println("no need is enough");
	}
	String []arry= {sel,sel2};
	return arry;
	}

	public static void main(String[] args) {
		//Scanner SC=new Scanner(System.in);
		//String [] menu={"table1","table2","table3","table4"};
		//System.out.println(menu);
		String[] res=Foodorder.table1();
		String[] res1=Foodorder.table2();
		String[] res2=Foodorder.table3();
		for (String string : res) {
			System.out.println("from table-1::"+string);
		}
		for (String string : res1) {
			System.out.println("from table-2::"+string);
		}
		for (String string : res2) {
			System.out.println("from table-3::"+string);
		}
//		System.out.println("from table-2::"+res1);
//		System.out.println("from table-3::"+res2);
		
	}

}
