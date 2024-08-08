package com.study.mystyle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/study")
	@ResponseBody
	public String index() {
		return "문건호";
	}

}
