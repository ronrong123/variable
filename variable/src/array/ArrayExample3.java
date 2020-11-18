package array;

public class ArrayExample3 {

	public static void main(String[] args) {
		
		double [] dAry = {23.2, 55.3, 52.8, 62.8};
		System.out.println("합: " + doubleSum(dAry));
		System.out.println("평균: " + doubleSum2(dAry));

	}
	// double [] => 23.2, 55.3, 52.8, 62.8 : dAry
	// method : doubleSum(), 매개변수 : double[](합해서반환)
	// 반환해주는 값 : double. 
	public static double doubleSum(double[] a) {
		double sum=0;
		for(double num:a) {
			sum += num;
		}
		return sum;		
	}
	public static double doubleSum2(double[] a) {
		double sum=0;
		for(double num:a) {
			sum += num;
		}
		sum /= a.length;
		return sum;		
	}
}
