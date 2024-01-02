package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpTestController {
	@GetMapping("/http/get")
	public String getHttp(@RequestParam int id, @RequestParam String name) {
		return "get" ;
	}

	//	FormData 로 요청 : : 모델로 받기 (Model 정의 필요 - ModelTest.java )
	@PostMapping("/http/post")
	public String postHttp(ModelTest m) {
		return "post" + m.getId() + m.getName() + m.getAddr();  
	}
	
	// FormData 로 요청 : : Request Body 로 받기
	@PostMapping("/http/post2")
	public String postHttp2(@RequestBody String name) {
		return "post" + name;  
	}
	
	// JSON data 로 요청 ::  모델로 받기
	@PostMapping("http/post3")
	public String postHttp3(@RequestBody ModelTest m) {
		return "post" + m.getAddr();
	}
	

	@PutMapping("/http/put")
	public String putHttp(@RequestBody ModelTest m) {
		return "put" + m.getId() + m.getName();
	}

	@DeleteMapping("/http/delete")
	public String deleteHttp() {
		return "delete";
	}

}
