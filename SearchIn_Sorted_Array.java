
public class SearchIn_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		int key=7;
		int result=search(arr,0,n-1,key);
		System.out.println("Key present at index--"+result);
	}
	
	static int search(int[] arr,int l,int r,int key) {
	
		int mid=((l+r)/2);
		
		
		if(arr[mid]==key) {
			return mid;
		
		}
		else if(arr[l]<=arr[mid]) {
			if(key>=arr[l] && key <= arr[mid]) {
				return	search(arr,l,mid-1,key);
			}
			return	search(arr,mid+1,r,key);
		}
		
		return mid;
		
		//return mid;
		
	}

}
