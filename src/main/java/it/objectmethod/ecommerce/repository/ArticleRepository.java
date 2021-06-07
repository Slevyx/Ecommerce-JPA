package it.objectmethod.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.ecommerce.models.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

	@Query(value = "SELECT x FROM Article x")
	public List<Article> findAllArticles();
}
