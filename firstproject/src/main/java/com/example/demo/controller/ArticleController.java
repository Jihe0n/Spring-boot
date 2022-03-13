package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ArticleForm;
import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;



@Controller
@Slf4j
public class ArticleController {

	@Autowired // 스프링부트가 객체를 자동연결 
	private ArticleRepository articleRepository;
	
	@GetMapping("articles/new")
	public String newArticleForm() {
		return "articles/new";
	}
	
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm form) {
		
		log.info(form.toString());
		
		// 받아온 DTO를 Entity로 바꾸는 과정 
		Article article = form.toEntity();
		log.info(article.toString());
		
		// Repository에게 엔티티를 디비에 저장하게함 
		Article saved = articleRepository.save(article);
		
		log.info(saved.toString());
		return "";
	}
	
	@GetMapping("/articles/{id}")
	public String show(@PathVariable Long id, Model model) { // path로 부터 얻어오는 변수 라는 어노테니션
		log.info("id = " + id);
		Article articleEntity = articleRepository.findById(id).orElse(null);
		model.addAttribute("article", articleEntity);
		log.info(articleEntity.toString());
		return "/articles/show";
	}
	
	@GetMapping("/articles")
	public String index(Model model) {
	ArrayList<Article> articleEntityList = articleRepository.findAll();
		return "";
	}
	
	
}
