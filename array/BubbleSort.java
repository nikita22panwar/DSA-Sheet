
public class Main
{
	public static void main(String[] args) {
	 int arr[]={5,3,7,69,2};
	 int n=arr.length;
	 int temp;
	 
	 for(int i=0; i<n-1; i++){
	     for(int j=0; j<n-i-1; j++){
	         if(arr[j]>arr[j+1]){
	             temp=arr[j];
	             arr[j]=arr[j+1];
	             arr[j+1]=temp;
	         }
	     }
	 }
	 for(int i=0; i<n; i++){
	     System.out.print(arr[i]+ " ");
	 }
	}
}
