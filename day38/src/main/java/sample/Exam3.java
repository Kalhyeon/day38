package sample;

public class Exam3 {

	public static void main(String[] args) {
//		문자열은 변경이 불가능 (상수)
//		문자열을 연산하면 계속 새로운 리터럴을 생성한다.
		
//		x 는 "Hello" 를 가리킨다.
		String x = "Hello";
		System.out.println(x.hashCode());
//		69609650
		
//		"Hello" => x 는 새로운 문자열 "Hello Java" 를 가리킨다.
		x = x + " Java";
		System.out.println(x.hashCode());
//		387417328
		
//		"Hello" => "Hello Java"
//		=> x 는 새로운 문자열 "Hello Java and JS" 를 가리킨다.
//		garbage : 참조 변수가 없는 객체
//		스마트폰에서 메모리 정리 => Garbage Collection (GC)
		x = x + " and JS";
		System.out.println(x.hashCode());
//		-674260638
	}

}
