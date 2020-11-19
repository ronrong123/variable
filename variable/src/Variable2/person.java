package Variable2;

public class person {// public : 외부에서도 적용이 가능하다.어디서든 상속 및 참조가 가능하다.
	// 필드 :클래스에서 값을 담는부분
	private String name;
	private int age;
	private double height;
	private double weight;
	// 필드끝
	// private : person이라는 클래스 안의 필드를 외부에서는 접근하지 못하도록 숨기겠다.(외부에 노출x)
	// 인스턴스
	// 클래스에 정의되어있는 인스턴스만 쓸수있음

	// 생성자: 필드의 초기값을 지정.(특징 : 반환타입이없음)
	public person() {
		this.name = "초기이름";
		this.age = 10;
		this.height = 170.0;
		this.weight = 65.0;
	}
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height=height;
		this.weight = weight;
	}

	// 메소드 : 값들을 반환하거나 또다른 연산을 가능하게하는것
	public void showInfo() {
		System.out.println("이름: " + name + " " + "나이: " + age + " " + "키: " + height + "입니다. ");
	}

	// 필드에 값을 저장, 불러오는 기능.
	public void setName(String name) { // void : 반환타입이없음
		this.name = name; // this: 클래스의 필드
	}

	public String getName() {// void가 없으니 반환하겠다는거인듯
		return this.name;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			this.age = 0;
	}

	public int getAge() {
		return this.age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
}
