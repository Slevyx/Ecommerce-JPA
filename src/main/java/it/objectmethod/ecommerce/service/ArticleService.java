package it.objectmethod.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.objectmethod.ecommerce.models.Article;
import it.objectmethod.ecommerce.repository.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepo;

	public ResponseEntity<List<Article>> findAllArticles() {
		ResponseEntity<List<Article>> articlesListResponse;
		List<Article> articlesList = articleRepo.findAllArticles();
		if (articlesList.isEmpty()) {
			articlesListResponse = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			articlesListResponse = new ResponseEntity<>(articlesList, HttpStatus.OK);
		}
		return articlesListResponse;
	}
}
