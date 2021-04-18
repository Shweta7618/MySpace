import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 3, 5, 7, 9};
		int k=4;
		int n=arr.length;
		k=k%n;
		System.out.println("k--"+k);
	/**	rotate(arr,0,n-k-1);
		rotate(arr,n-1,n-1);
		arr=rotate(arr,0,n-1);**/
		rotate(arr,0,k-1);
		rotate(arr,k,n-1);
		arr=rotate(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
		
	}

	static int[] rotate(int arr[],int start,int end){
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		//System.out.println(Arrays.toString(arr));
		return arr;
		
	}
	   
	   
	
}	

	
		
		
		
		
	

