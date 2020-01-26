package blog_bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ================================================================
说明：博客后台管理系统启动类

作者          时间             注释
王江民        2020-01-26		  创建

1778682202@qq.com
==================================================================
 */
@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		System.out.println("*****************		项目开始启动		*****************");

		SpringApplication.run(Application.class, args);

		System.out.println("*****************		项目启动完成		*****************");
	}
}
