
public class LinearArraySearch {

	public static void main(String[] args) {
		int arr[ ]={1,2,3,4,5,6,7,8,9,10};
		int num=5 , l=0,pos;
		for(int i=0; i<9; i++){
			if(arr[i]==num){
				pos=i;
				System.out.println("Number  found at position"+ pos);
				l++;
				break;
			}
		}
		if(l==0){
			System.out.println("Number is not found");
		}

	}

}
