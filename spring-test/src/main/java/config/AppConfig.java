package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"spring-test"
		// "spring-test.app", "spring-test.dao", "spring-test.service"
		// 저 프로젝트명 하위에 있는 것을이 다 스캔 대상이 된다.
})
public class AppConfig {

//	@Bean
//	public ArticleDao articleDao() { // method명이 Bean의 이름이 된다.
//		return new ArticleDaoImpl();
//	}
//	
//	@Bean
//	public ArticleService articleService() {
//		return new ArticleServiceImpl(articleDao()); // 이 이름으로 등록된 Bean이 있다면 그걸 꺼내서 쓰겠다는거임
//		// 코드 그대로 두번 호출된다고 해서 객체가 두번 생성된다고 보면 안됨
//		// Map에 있으면 걔를 바로 리턴하고
//		// 없으면 super.articleDao()를 호출하는거임.
//	}
//	
//	@Bean
//	public ArticleService articleService2() {
//		ArticleServiceImpl service = new ArticleServiceImpl();
//		service.setArticleDao(articleDao());
//		return service;
//	}
//	
//	@Bean(name="app")
//	public AppMain getApp() {
//		return new AppMain(articleService());
//	}
}
