package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

// DTO를 Entity로 바꿔줘야함 
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Article {
	
	@Id // 대표값
	@GeneratedValue // 자동생성 1,2,3 ... 
	private Long id;
	
	
	@Column
	private String title;
	
	@Column
	private String content;
	
	

}
