package s22.viikkoteht_1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Viikkoteht1Controller {

	
	@RequestMapping("index")
	@ResponseBody
	public String mainPage() {
		return "This is the main page";
	}
	@RequestMapping("contact")
	@ResponseBody
	public String contactPage() {
		return "This is the contact page";
	}
	@RequestMapping("hello")
	@ResponseBody
	public String helloPage(@RequestParam(name="location") String location, 
			@RequestParam(name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
}
