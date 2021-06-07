package it.objectmethod.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.ecommerce.models.Article;
import it.objectmethod.ecommerce.service.ArticleService;

@RestController
public class ArticlesController {

	@Autowired
	private ArticleService articleService;

	@GetMapping("/articles")
	public ResponseEntity<List<Article>> findAllArticles() {
		ResponseEntity<List<Article>> articlesListResponse = articleService.findAllArticles();
		return articlesListResponse;
	}
}
