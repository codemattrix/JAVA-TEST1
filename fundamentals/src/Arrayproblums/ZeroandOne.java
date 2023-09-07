package Arrayproblums;

public class ZeroandOne {
	static int count1=0;
public static int zero(int []arr) {
	int count=0;
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]==0) {
			count++;
		}else if(arr[i]==1){
			count1++;
		}
	}return count;
}
	public static void main(String[] args) {
		int[] arr= {1,0,1,1,2,0,0,0,2,1,0,2,2,2};
		int j=ZeroandOne.zero(arr);
		for(int i=0;i<=j;i++) {
			arr[i]=0;
		}
		for(int i=j;i<j+count1;i++) {
			arr[i]=1;
		}
		for(int i=j+count1;i<arr.length;i++) {
			arr[i]=2;
		}
		for(int data:arr) {
			System.out.print(" "+data);
		}
	}

}
