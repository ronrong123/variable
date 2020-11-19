package array;

public class MorningCode {

	public static void main(String[] args) {

		int [][] intAry = new int[5][5];
		int num=1;
		for(int i=0;i<intAry.length;i++) {
			for(int j=0;j<intAry[i].length;j++) {
				System.out.println("intAry[" + i +"," + j + "] >" + (intAry[i][j] = num++));
			}
		}
		String[] strAry = {"Hello", "World"};
			System.out.println(str);
		}
	}

}
