package edu.adeole.concourse.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/randomgreet")
public class RandomGreet {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getRandomGreet() {
		return "Same message with random number "+restTemplate.getForObject("http://localhost:9000/randomnumber/", String.class)+" makes my message random !";
	}

}
