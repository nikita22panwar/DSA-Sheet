
public class Main
{
      static void rotate(int arr[], int n, int s){
         for(int j=0; j<s; j++){
     
        int temp=arr[0];
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
            arr[n-1]=temp;
        }
    }
      
     static void display(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
      }

    
    
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		int s=2;
		rotate(arr,n,s);
		display(arr, n);
	}
}
