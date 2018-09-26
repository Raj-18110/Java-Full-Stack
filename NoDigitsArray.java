import java.util.*;
public class NoDigitsArray {
	public static Scanner k;
	public static void main(String[] args) {
		int size,count1=0,count2=0,count3=0,i;
		k = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		size=k.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements of array :");
		for(i=0;i<size;i++){
			arr[i]=k.nextInt();
		}

		for (i = 0; i <size; i++) {
			if (arr[i]/10<1) {
				count1++;
			}
			if (arr[i]/10>=1 && arr[i]/10<10) {
				count2++;
			}
			if (arr[i]/10>=10 && arr[i]/10<100) {
				count3++;
			}
		}
		System.out.println("There are "+count1+" one digited numbers");
		System.out.println("There are "+count2+" two digited numbers");
		System.out.println("There are "+count3+" three digited numbers");
	}
}
