/* Viswanadh Bhaskarla - Tracker app | Spring MVC | coinrank API Integration */

package com.vish.trackerapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vish.trackerapp.TrackerConfigProperties;
import com.vish.trackerapp.service.APIService;

@Controller
@EnableConfigurationProperties(TrackerConfigProperties.class)
public class HomeController {

	@Autowired
	APIService apiService;

	/* Maps controller to UI with the support of thymeleaf library. */
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("coinData", apiService.getCoinList());
		return "home";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/signup")
	public String signUp() {
		return "signup";
	}
}
