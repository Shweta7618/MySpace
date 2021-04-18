import java.util.Arrays;

public class ArrayConcepts{
	public static void main(String args[]) {
		int arr[]={9,3,9,3,9,7,9};
	Arrays.sort(arr);
	 System.out.println(unmatched_arr(arr));
	
	}
	
	public static	int unmatched_arr(int arr[]){
		int unmatchval = 0;
		for(int i=0;i<arr.length-1;i++){
			//System.out.println(arr[i]+"--------"+arr[i+1]);
			if (arr[i]==arr[i+1]) {
				
				i=i+1;
				//System.out.println("match");
			}
			else {
				
				 unmatchval=arr[i];
			}
			//System.out.println("i--"+i);
		}
		return unmatchval;
		
	}
}
