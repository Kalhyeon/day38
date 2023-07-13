package sample3;

import java.time.LocalDate;

// 아이디, 이메일, 비밀번호, 이름, 생년월일, 전화번호

public class Member {
	private String username;
	private String email;
	private String password;
	private String name;
	private LocalDate birthday;
	private String tel;
	
//	필드
	public Member(String username, String email, String password, String name, LocalDate birthday, String tel) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.tel = tel;
	}
	
//	생성자
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
