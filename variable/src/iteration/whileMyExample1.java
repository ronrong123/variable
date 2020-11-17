package iteration;

public class whileMyExample1 {
	public static void main(String[] args) {

		String str="*";
		
		for(int i = 0;i < 5;i++) {
			System.out.print(str);
			System.out.println(); //ln은 줄바꿈
			str += "*";						
		}
	
	}

}
