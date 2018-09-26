
public class BubbleSort {
	public static void main(String[] args) {
		  int n, i, j, swap;
		    int array[] = {3,34,14,22,5,6,87,2};
		    n=array.length;
		    for (i = 0; i < n - 1; i++) {
		      for (j = 0; j < n - i - 1; j++) {
		        if (array[j] > array[j+1]) 
		        {
		          swap       = array[j];
		          array[j]   = array[j+1];
		          array[j+1] = swap;
		        }
		      }
		    }	 
		    System.out.println("Sorted list of numbers");
		    for (i = 0; i < n; i++) 
		      System.out.println(array[i]);
	}
}
