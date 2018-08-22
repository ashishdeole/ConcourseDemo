package edu.adeole.concourse.demo.controller;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/randomnumber")
public class RandomNumber {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getRandomNumber() {	
		return String.valueOf(ThreadLocalRandom.current().nextInt());
	}

}
