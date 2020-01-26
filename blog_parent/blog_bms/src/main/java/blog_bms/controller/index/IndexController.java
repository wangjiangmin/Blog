package blog_bms.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"","/"})
public class IndexController {

	@RequestMapping("indexPage")
	public String indexPage() {
		System.out.println("跳转首页");
//		return "html/login";
//		return "index";
		return "redirect:hello";
		
	}
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		System.out.println("打招呼");
		return "hello world";
	}
}
