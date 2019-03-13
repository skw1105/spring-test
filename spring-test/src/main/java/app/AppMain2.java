package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import config.AppConfig;
import service.ArticleService;

public class AppMain2 {

	public static void main(String[] args) {
		GenericApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		ArticleService s1 = context.getBean("articleService", ArticleService.class);
		ArticleService s2 = context.getBean("articleService", ArticleService.class);
		if (s1 == s2) {
			System.out.println("s1, s2는 동일한 객체 입니다. --> 싱글톤");
		} else {
			System.out.println("s1, s2는 동일한 객체가 아닙니다.");
		}
		
		ArticleService s3 = context.getBean("articleService2", ArticleService.class);
		if (s1 == s3) {
			System.out.println("s1, s3는 동일한 객체 입니다. --> 싱글톤");
		} else {
			System.out.println("s1, s3는 동일한 객체가 아닙니다.");
		}
		
		// 예외 발생
		// ArticleService 타입으로 articleService와 articleService2가 있으므로
		// 결정하지 못함
		// ArticleService s4 = ctx.getBean(ArticleService.class);
		
		context.close();
	}

}
