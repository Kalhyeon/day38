package sample2_test;

import org.junit.jupiter.api.Test;

import sample2.Person;

public class PersonTest {
//	junit 은 테스트 도구이다.
//	테스트는 내가 작성한 코드를 실행하여 확인하는 것이다.
//	test1 은 junit 으로 실행해야 한다.
//	annotation 은 내가 원하는 것을 작성하는 것이 아닌 기술하는 것이다.
	@Test
	public void test1() {
		Person person = new Person();
		person.name = "홍길동";
		person.age = 20;
		System.out.println(person.name);
	}
}
