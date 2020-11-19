package Variable2;

public class VariableExample {
	public static void main(String[] args) {
		
		person p1 = new person("choi", 20, 175.5, 72.4);
		System.out.println("p1의 이름: " + p1.getName());
		System.out.println("p1의 나이: " + p1.getAge());
		System.out.println("p1의 키: " + p1.getHeight());
		System.out.println("p1의 체중: " + p1.getWeight());
//		p1.name = "Hong";
		p1.setName("홍");
		p1.setName("Hong");
//		p1.age = -10;
		p1.setAge(11);
//		p1.height = 178.8;
		p1.setHeight(178.8);
		p1.showInfo();
		
		person p2 = new person();
//		p2.name = "Hwang";
		p2.setName("황");
//		p2.age = 15;
//		p2.height = 188.8;
		p2.showInfo();		
		

		person p3 = new person();
//		p3.name = "Park";
//		p3.age = 17;
//		p3.height = 166.8;	
		p3.showInfo();
		//클래스에 정의되어있는 인스턴스만 쓸수있음
		
		
		person[] persons = {p1, p2, p3};
		
//		for(person per : persons) {
//			System.out.println(per.name);	
//			System.out.println(per.age);	
//			System.out.println(per.height);		
//			System.out.println();		
//		}
		
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);
//		System.out.println(p1.weight);
		
					
	}
}
