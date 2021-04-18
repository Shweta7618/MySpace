
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int n=arr.length;
		int k=4;
		
	int result=	searchElement(arr,k,n);
	System.out.println("result---"+result);
	}

	static int searchElement(int[] arr,int key,int n) {
		int result = 0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==key) {
				result=i;
			}
		}
		
		
		return result;
		
	}
}
