package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ArticleForm;
import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;

@Controller
public class ArticleController {

	@Autowired // 스프링부트가 객체를 자동연결 
	private ArticleRepository articleRepository;
	
	@GetMapping("articles/new")
	public String newArticleForm() {
		return "articles/new";
	}
	
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm form) {
		
		System.out.println(form.toString());
		
		// 받아온 DTO를 Entity로 바꾸는 과정 
		Article article = form.toEntity();
		System.out.println(article.toString());
		
		// Repository에게 엔티티를 디비에 저장하게함 
		Article saved = articleRepository.save(article);
		
		System.out.println(saved.toString());
		return "";
	}
	
}
