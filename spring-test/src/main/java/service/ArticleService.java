package service;

import domain.Article;

public interface ArticleService {
	void insert(Article article);
	Article selectOne(int id);
}
