package Test.programs;

public class Program4 {
	public static void indexs(int []arr1,int n) {
		
		for(int i=0;i<=arr1.length-1;i++) {
			int res=0;
			for(int j=i;j<=arr1.length-1;j++) {
				res+=arr1[j];
				if(res==n) {
					System.out.println("starting index of num is:"+i+" and ending index of num is:"+j);
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,3,6,4,9,0,11};
		int k=11;
		Program4.indexs(arr, k);
	}

}
