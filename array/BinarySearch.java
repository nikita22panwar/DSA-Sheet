import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={2,3,4,5,22,29,69};
	    int length=arr.length;
		System.out.println("Enter the number you want to search:");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int start=0;
		int end=length-1;
		while(start<=end){
		    int mid=start +(end-start)/2;
		     if(start==end && arr[end]!=key){
		 	System.out.println("Not in array");
		 	break;
		  	}
		  	  mid=start +(end-start)/2;
		  	 if(arr[mid]==key){
		  	     System.out.println("Key is present at "+ mid);
		  	     break;
		  	 }
		  else if(arr[mid]<key){
		       start=mid+1;
		  }else{
		      end=mid-1;
		  
		  }
	}
	}
}
