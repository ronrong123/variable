package array;

public class ArrayExample5 {

	public static void main(String[] args) {
		int[][] intAry = new int[3][3];// 2차원 배열
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 32, 33 };

		System.out.println(intAry[0][0]);		
		System.out.println(intAry[0].length);
		
		for(int i=0;i<intAry.length;i++) {
			for(int j=0;j<intAry[i].length;j++) {
				System.out.println("intAry[" + i +"," + j + "] >" + intAry[i][j]);
			}
		}

		int[][] intAry2 = { 
				{ 11, 12, 13 }, 
				{ 21 }, 
				{ 31, 32 } 
			};

		//숙제 intAry2의 배열의 각 합, 평균 구하기.
		//결과 : intAry2[0] => 합 : ??, 평균 : ??
		//결과 : intAry2[1] => 합 : ??, 평균 : ??
		//결과 : intAry2[2] => 합 : ??, 평균 : ??

	}

}
