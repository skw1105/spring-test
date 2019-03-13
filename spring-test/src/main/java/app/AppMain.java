package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

import config.AppConfig;
import domain.Article;
import service.ArticleService;

@Component
public class AppMain {

	@Autowired
	ArticleService service;
	
	public AppMain() {
		//service = new ArticleServiceImpl();
	}
	
	public AppMain(ArticleService service) {
		this.service = service;
	}
	
	public void setArticleService(ArticleService service) {
		this.service = service;
	}
	
	public void run() {
		Article article = new Article("테스트", "테스트 내용");
		service.insert(article);
		
		Article article2 = service.selectOne(100);
		System.out.println(article2);
	}
	
	public static void main(String[] args) {
//		AppMain app = new AppMain();
//		app.run();
		
		GenericApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class); // 설정파일(자바 클래스)을 넘겨준다.
		
		AppMain app = context.getBean(AppMain.class);
		app.run();
		
		context.close();
	}

}
