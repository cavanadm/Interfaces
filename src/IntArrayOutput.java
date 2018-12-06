import java.util.Arrays;

public class IntArrayOutput{

	public static void main(String[] args) {
		
		int a = 2;
		int b = 4;
		int c = -8;
		int d = 10;
		System.out.println(Arrays.toString(HalfInt(a,b,c,d)));
		
		
}
	static int[] HalfInt(int... a) {
		Half halvedNum =  	new Half();
		int[] numbers = new int[a.length];
		int counter = 0;
		for(int num : a) {
			if(num <= 0) {
				throw new IllegalArgumentException("Number must be greater than 0");
			}
			else {
			numbers[counter]= halvedNum.evaluate(num);
			counter++;}	
		}
		return numbers;


}
}

interface Function{
	static int evaluate(int n){
		return n;
	}
}

class Half implements Function{
	
	int evaluate(int n){
		return n / 2;
	}
}


	
	

