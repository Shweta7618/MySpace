import java.util.Arrays;

public class Rotationusing_0n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		int d=10;
		d=d%n;
	arr=rotateleft(arr,0,d-1);
	arr=rotateleft(arr,d,n-1);
	arr=rotateleft(arr,0,n-1);
	System.out.println(Arrays.toString(arr));
		
	}
	
	static int[] rotateleft(int arr[],int start,int end) {

		//System.out.println(d%n);
	
		while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
		}
		
		return arr;
		
	}
	
}
