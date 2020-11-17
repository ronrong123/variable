package iteration;

public class Ecercise04 {

	public static void main(String[] args) {
		
		System.out.println("<terminated>");
		System.out.println("-----------");
		
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			int i = num1 + num2;
			System.out.println("("+ num1 + "," + num2+")");
			if(i == 5) {
				break;
			}
		}	
		
		
	}

}
