package iteration;

public class MorningCode {
	public static void main(String[] args) {
		int sum7 = 0, sum8 = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 7 == 0) {
				sum7 += i;
			} else if (i % 8 == 0) {
				sum8 += i;
			}
		}

		System.out.println(sum7);
		System.out.println(sum8);
		//
		int i2 = 1;
		int sum9 = 0, sum10 = 0;

		while (true) {
			if (i2 % 7 == 0 && i2 % 8 == 0) {
				break;
			} else if (i2 % 8 == 0) {
				sum10 += i2;
			} else if (i2 % 7 == 0) {
				sum9 += i2;
			}
			i2++;
		}
		System.out.println(sum9);
		System.out.println(sum10);
	}

}
