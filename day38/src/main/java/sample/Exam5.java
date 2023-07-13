package sample;

import java.util.HashMap;

// JS 는 설계도 없이 객체를 바로 쉽게 생성한다.
// const person1 = {name: "홍길동", age: 20};
// 단점은 객체를 제대로 만들었는지 검증이 되지 않는다.
// const person2 = {name: "전우치", age: 30};

public class Exam5 {

	public static void main(String[] args) {
//		둘 이상의 정보를 표현할 때 이름과 값의 쌍으로 표시
//		1. HashMap
		HashMap map = new HashMap();
		map.put("name", "홍길동");
		map.put("age", 20);
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		
//		location.search 를 map 으로 바꾸는 JS 코드
//		const params = new URLSearchParams(location.search);
//		console.log(params.get('pageno'));
	}

}
