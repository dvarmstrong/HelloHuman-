package com.helloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String name ) {
		if(name==null) {
			return "Hello Human";
		}
		else {
			
			return "Hello : " + name;
		}
	}
	
	@RequestMapping("/fullname")
	public String fullname(@RequestParam(value="q", required=true) String first_name, String last_name) {
		return "Your full name is :  " + first_name + last_name;
	}
	
//	@RequestMapping("/hello")
//	public String hello(@RequestParam(value="q")String hello) {
//		try {
//			for(int i = 0; i < String.length(); i++) {
//				return i + "hello";
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		
	
	
//	Wasn't sure how to do the sensi bonus but I attempted to ^^^^^^^


}
