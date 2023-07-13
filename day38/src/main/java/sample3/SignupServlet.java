package sample3;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// get : 읽기 (R)
// post : 생성하고 (C) 변경하고 (U) 삭제하기 (D)

@WebServlet("/member/create")
public class SignupServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
//		사용자에게 받아오는 값은 모두 String 이다.
		String date = request.getParameter("birthday");
//		"2022-07-13"
//		.split("-") : 배열을 하이픈으로 끊어 읽어라.
		String[] ar = date.split("-");
		int year = Integer.parseInt(ar[0]);
		int month = Integer.parseInt(ar[1]);
		int day = Integer.parseInt(ar[2]);
//		of 메서드로 객체 생성 : 최근 스타일의 문법
		LocalDate birthday = LocalDate.of(year, month, day);
		String tel = request.getParameter("tel");
		
		Member member = new Member(username, email, password, name, birthday, tel);
		
		RequestDispatcher rd = request.getRequestDispatcher("print.jsp");
		request.setAttribute("member", member);
		rd.forward(request, response);
	}

}
