package sample2;

// 주민등록번호, 이름, 주소, 전화번호로 구성된 클래스를 작성하시오.

public class Person4 {
//	1. private 필드 생성 (캡슐화)
	private Integer idcard;
	private String name;
	private String address;
	private String tel;
	
//	2. 캡슐화된 필드는 읽고 쓸 수 없다 => Getter/Setter 필요
//	   Getter - 필드를 읽는다, Setter - 필드를 변경한다.
//	   모든 필드가 Getter/Setter 를 가지는 것은 아니다.
//	   업무의 규칙에 따라 Getter/Setter 를 적절하게 지정한다.
	
//	3. 생성자 : 리턴 값이 없고 (void 가 아니라 아예 없음),
//			  함수의 이름이 클래스의 이름과 같다.
	public Person4(Integer idcard, String name, String address, String tel) {
		this.idcard = idcard;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
