package variable;

public class MorningCode {

	public static void main(String[] args) {
		
		int numbers[]= {23,56,34,65,28,21};
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==1) {
				 sum += numbers[i];
			}			
		}
		System.out.println(sum);
		
		int sum2=0;
		
		for(int i2=0;i2<numbers.length;i2++) {
			sum2+=numbers[i2];
		}
		System.out.println(sum2/numbers.length);
	}

}
