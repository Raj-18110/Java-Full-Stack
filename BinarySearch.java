import java.util.*;
public class BinarySearch {

	  public static void binaryKeySearch(int arr[],int first,int last,int num){
     	int mid=(first+last)/2;
     	while(num<arr[first]&&num>arr[last]){
     		System.out.println("Key not found in the array");
     		break;
     	}
     	if(num==arr[mid]){
     		System.out.println("Key found at position"+mid);
     	}
     	else if(num>arr[mid]){
     		binaryKeySearch(arr,mid,last,num);
     	}
     	else{
     		binaryKeySearch(arr,first,mid,num);
     	}
      }

	public static void main(String[] args) {
         int array[]={3,45,65,79,66,2,11,34,25,87};
         int n=array.length;
         int key=66;
         Arrays.sort(array);
         binaryKeySearch(array,0,n-1,key);
	}
}
