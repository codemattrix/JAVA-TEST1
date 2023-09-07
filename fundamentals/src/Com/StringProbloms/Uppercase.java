package Com.StringProbloms;

public class Uppercase {
	public static void uppercase(String str) {
		char arr[]=str.toCharArray();
		for(char ch:arr) {
			int arr1=ch;
			int arr2=arr1-32;
			System.out.print((char)arr2);
		}
	}

	public static void main(String[] args) {
		String str="ravish";
		Uppercase.uppercase(str);

	}

}
