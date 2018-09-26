
public class DecimalToBinary {

	public static void main(String[] args) {
		int n=127,i;
        String b = "";
        while(n > 0)
        {
            i=n%2;
            b=b+""+i;
            n=n/2;
        }
        System.out.println("Binary number:"+b);
         
	}

}
