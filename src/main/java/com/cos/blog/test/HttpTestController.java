package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpTestController {
	@GetMapping("/http/get")
	public String getHttp() {
		return "get";
	}

	@PostMapping("/http/post")
	public String postHttp() {
		return "post";
	}

	@PutMapping("/http/put")
	public String putHttp() {
		return "put";
	}

	@DeleteMapping("/http/delete")
	public String deleteHttp() {
		return "delete";
	}

}
