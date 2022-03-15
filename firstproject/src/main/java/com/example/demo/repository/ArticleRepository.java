package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>{

	@Override
	ArrayList<Article> findAll();
}
