package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import config.AppConfig;
import device.Camera;

public class AppMain3 {

	public static void main(String[] args) {
		GenericApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Camera c1 = context.getBean(Camera.class);
		c1.setId(0);
		Camera c2 = context.getBean(Camera.class);
		c1.setId(1);
		Camera c3 = context.getBean(Camera.class);
		c1.setId(2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		context.close();
	}

}
