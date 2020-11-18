package variable;

public class ArrayExample1 {

	public static void main(String[] args) {
		int numbers[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int num=0;
		for(int i=0;i<numbers.length;i++) {
			if(i%2 == 1) {
				num += numbers[i];			
			}		
		}
		System.out.println(num);	
	}
}
