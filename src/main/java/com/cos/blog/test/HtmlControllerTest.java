package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlControllerTest {
	
	@GetMapping("/http/get/html")
	public String tempHome() {
		return "home2";
	}
}
