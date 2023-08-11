package test.demo;

public class nonprimitive{
	public static void main(String arg[]) {
		String str="test";
		System.out.println("sting:"+str);
		
		String str1=new String(str);
		System.out.println("String:"+str1);
		int arr[]= new int[3];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		System.out.println(arr);
		System.out.println(arr[2]);
	}
}