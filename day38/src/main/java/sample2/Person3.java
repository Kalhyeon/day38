package sample2;

public class Person3 {
//	기본적으로 private : 캡슐화
	private String name;
	private Integer age;

//	public 으로 객체를 사용할 수 있는 버튼을 제공해야 한다.
//	개발자가 지정한 방법으로만 객체의 값을 읽고 쓸 수 있다.
	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
