
public class Main
{
     public static int linear(int arr[], int key){
         for(int i=0; i<arr.length; i++){
             if(arr[i]==key){
                 return i;
             }
         }
         return -1;
     }
    
    
	public static void main(String[] args) {
		int arr[]={3,4,5,2,1,8};
		int key=69;
		System.out.println(key + " is found at " + linear(arr, key));
	}
}
