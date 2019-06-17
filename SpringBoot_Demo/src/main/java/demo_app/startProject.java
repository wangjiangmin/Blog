package demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
public class startProject extends SpringBootServletInitializer{
	
	public static void main(String [] args) {
		System.out.println("*****************		项目开始启动		*****************");
		
		SpringApplication.run(startProject.class, args);
		
		System.out.println("*****************		项目启动完成		*****************");
	}
}
