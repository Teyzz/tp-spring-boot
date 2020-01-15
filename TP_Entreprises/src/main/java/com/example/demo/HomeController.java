package com.example.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Value("${spring.application.name}")
	String appName;
	
	ArrayList<Entreprise> entreprises = new ArrayList<Entreprise>();

	@RequestMapping("/")
	public String home(@RequestParam(value="username", required=false, defaultValue="Theo") String username, Model model) {
		model.addAttribute("appName", appName);
		model.addAttribute("utilisateur", username);
		return "home";
	}
	
	@RequestMapping("/entreprises") //pour le home
	public String etsPage(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
	@RequestMapping(value="/entreprises", method=RequestMethod.GET)
	public String entreprises(HttpSession session, Model model) {
		model.addAttribute("appName", appName);
		return "entreprises";
	}
}