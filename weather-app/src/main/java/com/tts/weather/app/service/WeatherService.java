package com.tts.weather.app.service;

import com.tts.weather.app.model.Response;
import com.tts.weather.app.model.ZipCode;
import com.tts.weather.app.repository.ZipCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherService {

	@Value("${api_key}")
	private String apiKey;

//	@Autowired
	ZipCodeRepository zipCodeRepository;

	public WeatherService(ZipCodeRepository zipCodeRepository){
		this.zipCodeRepository = zipCodeRepository;
	}

	public Response getForecast(String zipCode){
		String url = "http://api.openweathermap.org/data/2.5/weather?zip="
				+ zipCode + "&units=imperial&appid=" + apiKey;
		RestTemplate restTemplate = new RestTemplate();
		try {
			zipCodeRepository.save(new ZipCode(zipCode));
			return restTemplate.getForObject(url, Response.class);
		} catch (HttpClientErrorException e) {
			Response response = new Response();
			response.setName("error");
			return response;
		}
	}

	public List<ZipCode> getLast10Zips(){
		List<ZipCode> zipCodeList = (List<ZipCode>) zipCodeRepository.findAll();
		Collections.reverse(zipCodeList);
		return zipCodeList.stream().limit(10).collect(Collectors.toList());
	}

}
