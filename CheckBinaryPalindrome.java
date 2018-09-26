
public class CheckBinaryPalindrome {

	public static void main(String[] args) {
		int n=127,i,t;
		t=n;
        String b = "";
        while(n > 0)
        {
            i=n%2;
            b=b+""+i;
            n=n/2;
        }
        System.out.println("Binary number:"+b);
        int x=Integer.parseInt(b);
        int temp,r=0,q=0;
		temp=x;
		while(temp!=0){
			r=temp%10;
			q=q*10+r;
			temp=temp/10;	
			
		}
		if(x==q)
			System.out.println("The binary number of "+t+"is a Palindrome");
		else
			System.out.println("The binary number of "+t+"is not a Palindrome");

	}

}
