package com.mmall.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class B2FController {
    @RequestMapping(value="/test")
	public String testB2F() {
		return "index";
	}
}
