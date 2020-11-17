package variable;

public class ReferenceExample {
	public static void main(String[] args) {

		String str1 = "Hello";// 주소값 ..
		String str2 = "Hello";// 주소값 ..
		String str3 = new String("Hello");// 주소값 .. 같은 주소값이라도new를 추가하면 다른 주소값이됨.
		if (str1.equals(str3)) {//equals는 안에있는 주소값을 비교하는것.
			System.out.println("동일한 값.");
		} else {
			System.out.println("다른 값.");
		}

	}

}
