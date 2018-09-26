import java.util.*;
public class NoOccurences {
	public static Scanner k;
	public static void main(String[] args) {
		int num,len,temp,p;
		k = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num=k.nextInt();
		len = (int) (Math.log10(num) + 1);
		int[] arr=new int[10];
		temp=num;
		for (int i = 0; i <len; i++) {
			p=temp%10;
			arr[p]=arr[p]+1;
			p=0;
			temp=temp/10;
		}
		for (int i = 0; i <=9; i++) {
			System.out.println(i+" is repeated "+arr[i]+" times");
		}
	}
}