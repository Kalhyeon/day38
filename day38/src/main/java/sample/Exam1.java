package sample;

import java.util.Date;

// 프론트 입력
// 프론트 => 백 : 400
// 백 처리 : 500 => NullPointerException
public class Exam1 {
//		JS 와 비교
//		1. 접근 제한자 : public, private
//		2. 리턴 타입
	public static Date getBirthday() {
//		A 개발자가 작성
		return null;
	}
//	static 은 static 끼리만 사용할 수 있다.
	public static void main(String[] args) {
//		A 개발자가 작성한 함수를 사용한다.
		Date d = getBirthday(); // 참조 변수 d (null)
//		NullPointerException : null 참조 변수를 사용
//		참조 변수가 null 값을 가지는 것은 오류가 아니다.
		System.out.println(d.getYear());
	}

}
