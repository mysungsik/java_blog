package com.cos.blog.model;

import java.security.Timestamp;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
		@Id // primaryKey
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(nullable = false, length = 30)
		private String username;
		
		@Column(nullable = false, length = 30)
		private String password;
		
		@Column(nullable = false, length = 100)
		@ColumnDefault("'test@test.com'")
		private String email;
		
		@CreationTimestamp
		private Timestamp createDate;
}
