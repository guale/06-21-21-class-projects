package com.tts.weather.app.controller;

import com.tts.weather.app.model.Request;
import com.tts.weather.app.model.Response;
import com.tts.weather.app.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeatherController {

	@Autowired
	private WeatherService weatherService;

	@GetMapping
	public String getIndex(Model model){
//		Response response = weatherService.getForecast("78705");
//		model.addAttribute("data", response);
		model.addAttribute("request", new Request());
		model.addAttribute("searches", weatherService.getLast10Zips());
		return "index";
	}

	@PostMapping
	public String postIndex(Request request, Model model){
		Response data = weatherService.getForecast(request.getZipCode());
		model.addAttribute("data", data);
		model.addAttribute("searches", weatherService.getLast10Zips());
		return "index";
	}

}
