package com.cos.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

@RestController
public class HttpTestController2 {
	
	@Autowired	// 의존성 주입(DI)
	private UserRepository userRepository;
	
	@PostMapping("/http/join2")
	public String join2(User u) {
		System.out.println("userid" + u.getUsername());
		System.out.println("userid" + u.getPassword());
		System.out.println("userid" + u.getEmail());
		
		userRepository.save(u);
		return "회원가입이 완료되었습니다";
	}
}