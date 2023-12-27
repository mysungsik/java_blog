package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// Controller 는 파일을 return 한다.
public class TempCotrollerTest {

	@GetMapping("/temp/home")
	public String showHome() {
		System.out.println("show home");
		// 기본 경로 : src/main/resources/static
		// 리턴 명 : "/" 를 반드시 붙여야한다.
		// static 에는 브라우저가 인식 가능한 "정적 파일" 만 넣어야한다. (html, img 등....)
		// jsp 파일은 "정적 파일" 이 아니므로(동적인 java 파일이다), static 에 넣는 것은 옳지 않다.
		return "/home.html";
	}

	@GetMapping("/temp/jsp")
	public String showJsp() {
		System.out.println("show jsp");
		return "home2";
	}

}
