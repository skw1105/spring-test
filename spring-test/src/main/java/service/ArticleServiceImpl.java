package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ArticleDao;
import domain.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleDao dao; // 의존 객체

	public ArticleServiceImpl() {
		// this.dao = new ArticleDaoImpl();// 이렇게 하면
		// 요구사항 변경 시 코드 수정 발생
		// 다른 dao class를 원하는 상황이 발생한 경우
		// OracleDB Dao 쓰고싶을때 MySqlDB Dao MSSqlDB Dao 쓰고싶을때 등등
	}

	// 이렇게 하면 dao객체가 달라지더라도 코드를 수정할 필요가 없다.
	public ArticleServiceImpl(ArticleDao dao) {
		this.dao = dao;
	}

	// 이렇게 하면 dao객체가 달라지더라도 코드를 수정할 필요가 없다.
	public void setArticleDao(ArticleDao dao) {
		this.dao = dao;
	}

	@Override
	public void insert(Article article) {
		System.out.println("> Article Service: 글 저장");
		dao.insert(article);
	}

	@Override
	public Article selectOne(int id) {
		System.out.println("> Article Service: 글 추출");
		return dao.selectOne(id);
	}

}
