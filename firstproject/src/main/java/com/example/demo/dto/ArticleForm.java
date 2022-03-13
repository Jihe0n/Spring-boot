package com.example.demo.dto;

import com.example.demo.entity.Article;

import lombok.AllArgsConstructor;
import lombok.ToString;

// form 데이터를 받아올 그릇 
@AllArgsConstructor
@ToString
public class ArticleForm {

	private String title;
	private String content;
	

	public Article toEntity() {
		// TODO Auto-generated method stub
		return new Article(null, title, content);
	}
	
} 
