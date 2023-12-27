package com.cos.blog.model;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 100)
	private String title;
	
	@ColumnDefault("0")
	private int count;
	
	@ManyToOne								// Many(현 Model = Board)가 One(User Model) 에 종속 → 여러개의 글은 하나의 유저에 의해 작성 가능
	@JoinColumn(name="userId")	// 컬럼 이름은 userId 가 된다.
	private User user;						// User 타입( User Model) 의 Primary Key 와 함께 Join 된다.
	
	@Lob	// 대용량 데이터를 처리 (블로그 글의 내용값과 같은)
	private String content;
	
}
