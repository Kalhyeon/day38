package sample2_test;

import org.junit.jupiter.api.Test;

import sample2.Person4;

public class PersonTest4 {
	@Test
	public void test1() {
		Person4 p = new Person4(1111, "홍길동", "서울시", "2222");
		
//		Setter 는 값을 주는 메서드가 아닌 값을 변경하는 메서드이다.
//		Setter 로 필드로 초기화하면 안된다
//		=> 이름과 주민번호는 어떻게 주나?
//		객체 초기화는 Setter 가 아니라 생성자로 수행한다.
	}
	
}
