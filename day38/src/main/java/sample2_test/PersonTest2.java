package sample2_test;

import sample2.Person2;
import sample2.Person3;

public class PersonTest2 {
	public void test1() {
		Person2 p = new Person2();
		
		p.name = "홍길동";
		p.name = "전우치";
		p.name = "임꺽정";
		
//		객체 지향의 특징 : 클래스는 어떻게 만들어야 하는가의 옛 버전
//		클래스는 소프트웨어의 부품이다
//		=> 예를 들어 모니터는 컴퓨터를 구성하는 부품
//		=> 케이스를 씌워 보호 (건들면 안되니까)
//		1. 캡슐화 : 클래스를 만들고 내부는 private 로 보호하라.
//		2. 상속
//		3. 다형성
		
		Person3 p3 = new Person3();
		p3.setName("홍길동");
		
	}
	
}
