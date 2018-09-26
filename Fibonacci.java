
public class Fibonacci {

	public static void main(String[] args) {
		int n = 10, i=0, j=1;


		for (int k=1; k<=n; k++)
		{
			System.out.print(i+" ");

			int sum = i + j;
			i = j;
			j = sum;
		}

	}

}
