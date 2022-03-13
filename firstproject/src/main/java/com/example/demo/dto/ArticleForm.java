package com.example.demo.dto;

import com.example.demo.entity.Article;

// form 데이터를 받아올 그릇 
public class ArticleForm {

	private String title;
	private String content;
	
	// 생성자 
	public ArticleForm(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String toString() {
		return "ArticleForm => "+"title : " + title + " content :" + content;
	}

	public Article toEntity() {
		// TODO Auto-generated method stub
		return new Article(null, title, content);
	}
	
} 
