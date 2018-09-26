
public class BinaryToDecimal {

	public static void main(String[] args) {
		int n=10000;
		int decimal=0,p=0;
		while(n!=0)
		{
			decimal+=((n%10)*Math.pow(2,p));
			n=n/10;
			p++;
		}
		System.out.println(decimal);
	}
}
