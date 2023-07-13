package sample2;

// 접근 제한 (p262)
// public		누구나 접근 가능
// protected	같은 패키지, 자식 객체만 사용 가능
// default		같은 패키지만 접근 가능 (아무 키워드를 입력하지 않음)
// private		외부에서 접근 불가 - 객체 내부

public class Person {
	public String name;
	public Integer age;
	String address;			//default 접근 제한
}
