package com.example.springboot;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController implements ErrorController {
	@Value("${spring.application.name}")
	
	String appName;
	private static final String PATH = "/error";
	
	//@RequestMapping("/")
	//public String index() {
	//	return "Greetings from Spring Boot!";
	//}
	
	@GetMapping("/") //pour le home
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
	
	@GetMapping("/date") // à créer pour chaque page: ici pour le "date"
	public String datePage(Model model) {
		model.addAttribute("appName", appName);
		model.addAttribute("standardDate", new Date());
		model.addAttribute("localDate", LocalDate.now());
		model.addAttribute("timestamp", Instant.now());
		model.addAttribute("localDateTime", LocalDateTime.now());
		return "date";
	}

	@RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }
	
	@Override
	public String getErrorPath() {
		return PATH;
	}
	
}