package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HomeController 
{
	@RequestMapping("/home")
 public String showHomePage()
 {
		System.out.println("Controller invoked");
		return "home";
 
 }
 
}
