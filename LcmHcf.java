public class DecimalBinaryPalindrome {
	public static void main(String[] args) {
		int num=121,temp1,temp2,val=0,remainder,i=1;
		long binaryNumber=0;
		temp1=num;
		while(temp1>0){
			remainder = temp1 % 2;
			binaryNumber +=  remainder*i;
			i*=10;
			temp1 /= 2;     
		}
		System.out.println(num+" in Decimal System is "+binaryNumber+" in Binary System");
		temp2=num;
		while(temp2>0){
			val=val*10+temp2%10;
			temp2=temp2/10;
		}
		if(val==num)
			System.out.println(num+" is a Palindrome");
		else
			System.out.println(num+" is not a Palindrome");
	}
}
