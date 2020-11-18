package array;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] intAry;
		int sum = 0;
		intAry = new int[] { 34, 66, 82 }; // 두줄?로 할때는 new를 꼭 넣어야함
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("결과값1: " + sum);
		sum = 0;
		sum = sumAry(intAry);
		System.out.println("결과값2: " + sum);
		
		int[] intAry2 = {11, 22, 33, 44, 55, 66, 77};
		System.out.println("결과값3: " + sumAry(intAry2));
		
	}

	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int num:ary) { //int num을 ary값 만큼 반환하겠다.
			sum += num;			
		}
		return sum;
	}
}
