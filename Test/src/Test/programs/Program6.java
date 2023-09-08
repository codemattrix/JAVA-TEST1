package Test.programs;

public class Program6 {
public static void fooddis(int arr1[],int rat,int food,int len) {
	int rat1=rat*2;
	int ele=0;
	for(int i=0;i<=arr1.length-1;i++) {
		for(int j=i+1;j<arr1.length-1;j++) {
			ele+=arr1[j];
			if(ele==rat1) {
				System.out.println("from house :"+i+" to :"+j+" is sufficient");
			}else {
				System.out.println(0);
			}
		}
		
		
	}
}
	public static void main(String[] args) {
		int r=7;
		int unit=2;
		int arr[]= {2,8,3,5,7,4,1,2};
		int n=arr.length;
		Program6.fooddis(arr, r, unit, n);
	}

}
