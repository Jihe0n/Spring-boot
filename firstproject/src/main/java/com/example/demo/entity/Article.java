package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// DTO를 Entity로 바꿔줘야함 
@Entity
public class Article {
	
	@Id // 대표값
	@GeneratedValue // 자동생성 1,2,3 ... 
	private Long id;
	
	
	@Column
	private String title;
	
	@Column
	private String content;
	
	
	// 생성자 
	public Article(Long id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
	
	public String toString() {
		return "Article => "+"id : "+ id + " title : " + title + " content :" + content;
	}
	
}
