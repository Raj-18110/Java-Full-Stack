import java.util.Arrays;
public class thirdLargestNumber {
	public static void main(String[] args) {
		int array[]={3,45,65,79,66,2,11,34,25,87};
		Arrays.sort(array);
		int n=array.length;
		System.out.println("Third largest Element:"+array[n-3]);
	}
}
