package Com.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		//array is homogeneous(similar type)data structure
		//creating an array
		//datatype[]nameof Array={1,2,3,4};
		//datatype nameof Array[]={1,2,3,4,5};
		int []arr= {1,2,3,4,5};
		System.out.println(arr.hashCode());
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		//2nd way for create array is
		//datatype[] arrayname=new datatype[size];
		int []arr2=new int[4];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		arr2[3]=4;
		//its static in nature it always start with 0 index
		System.out.println("new element of the array");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.println(arr2[i]);
		}
		//enhance for-loop:array like structure
		for(int i:arr2) {
			System.out.println(i);
		}
		
	}

}
