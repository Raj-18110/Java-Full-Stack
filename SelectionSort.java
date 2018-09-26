
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {3,34,14,22,5,6,87,2};
		int n=array.length;
		int i,j,k;
		for ( i = 0; i < n- 1; i++)
		{
			k = i;
			for ( j = i + 1; j < n; j++)
				if (array[j] < array[k]) 
					k = j;

			int smallerNumber = array[k];  
			array[k] = array[i];
			array[i] = smallerNumber;
		}
		System.out.println("Sorted array is:");
		for (i = 0; i < n; i++) 
			System.out.println(array[i]);

	}

}
