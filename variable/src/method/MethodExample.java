package method;

public class MethodExample {
	public static void main(String[] args) {
		math m1 = new math();
		double sum = m1.sum(10.5, 20);
		System.out.println( sum);
		double area = m1.getArea(5.5);// pi * r * r
		System.out.println("원의 결과: " + area);
		// 정사각형 넓이 : getRectangle, 매개변수 : 4.2
		area = m1.getRectangle(4.2);
		System.out.println("정사각형 넓이: " + area);
		// 직사각형 넓이 : getRectangle, 매개변수 : 4.2, 2.4
		area = m1.getRectangle(4.2, 2.4);
		System.out.println("직사각형의 넓이: " +area);
		
		int[] ary1 = {5,10,15,20};
		int arysum = m1.getArysum(ary1);
		System.out.println("배열의 합: " + arysum);
		person p1 = new person("이창호", 10, 135.5, 31.95);
		double d1 = m1.getProperWeight(p1.height);
		System.out.println(d1);
		if(p1.weight>d1) {
			System.out.println("체중과다...");
		}else if(p1.weight == d1){
			System.out.println("적정체중...");
		}else { 
			System.out.println("체중미달...");
		}
		
	}
}
