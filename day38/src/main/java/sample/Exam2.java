package sample;

public class Exam2 {

	public static void main(String[] args) {
//		문자열은 상수 => 변경 불가능
		
//		변수 a, b, 리터럴 10
//		코드에 값이 직접 나타나는 것 : literal
//		literal 은 method 영역 (static)
//		리터럴은 이름이 없는 상수 => 변경 (조작) 불가능
//		리터럴은 가급적 줄이자.
		int a = 10, b = 10;
		
//		문자열 참조 변수는 문자열 리터럴을 가리킨다
//		따라서 String 은 변경할 수 없다.
		String x = "hello";
		String y = "hello";
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
	}

}
