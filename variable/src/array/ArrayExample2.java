package array;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] intAry = new int[5]; // 배열을 크기를 선언해서 만들면 기본값이 들어감
		intAry[0] = 15;
		intAry[4] = 33;

		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}
		double[] doubleAry; // 선언만하면 출력이안됨
		doubleAry = new double[] { 2.3, 2, 4.5, 2.2, 1.6 };
		System.out.println(doubleAry[0]);

		double sum = 0;
		for (int i = 0; i < doubleAry.length; i++) {
			sum += doubleAry[i];
		}
		System.out.println("sum: " + sum);

		// enhanced for
		sum = 0;
		for (double dbl : doubleAry) {// 각각의 요소들을 반복해 보여주세요
			sum += dbl;
			// System.out.println(db1);
		}
		System.out.println(sum);
		sum=0;
		for(int dbl2 : intAry) {
			sum += dbl2;
		}
		System.out.println(sum);
	}

}
