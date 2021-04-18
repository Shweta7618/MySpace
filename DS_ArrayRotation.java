import java.util.Arrays;

public class DS_ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		int d=2;
	arr=rotateleft(arr,d,n);
	System.out.println(Arrays.toString(arr));
		
	}
	
	static int[] rotateleft(int arr[],int d,int n) {
		System.out.println("n--"+n);
		
		
		for(int i=0;i<d;i++) {
			int	temp=arr[0];
			//System.out.println("arr[0]--"+arr[0]);
			for(int j=0;j<n-1;j++) {
				arr[j]=arr[j+1];
				
			//	System.out.println(Arrays.toString(arr));
			}
			arr[n-1]=temp;
			//System.out.println(Arrays.toString(arr));
		}
	//	System.out.println(Arrays.toString(arr));
		return arr;
		
	}

}
