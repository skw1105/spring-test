package dao;

import domain.Article;

public interface ArticleDao {
	void insert(Article acticle);
	Article selectOne(int id);
}
