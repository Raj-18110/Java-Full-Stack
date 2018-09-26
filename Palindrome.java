
public class Palindrome {

	public static void main(String[] args) {
		int num=656,temp,r=0,q=0;
		temp=num;
		while(temp!=0){
			r=temp%10;
			q=q*10+r;
			temp=temp/10;		
		}
		if(num==q)
			System.out.println(num+" is a Palindrome");
		else
			System.out.println(num+" is a Palindrome");

	}

}
