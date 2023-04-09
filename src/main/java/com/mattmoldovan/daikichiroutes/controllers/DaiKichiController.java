package com.mattmoldovan.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaiKichiController {
	
	@GetMapping("/daikichi")
	public String daikichi() {
		return"Welcome!";
	}
	
	@GetMapping("/daikichi/today")
	public String today() {
		return"Today you will find luck in all your endeavors!";
	}
	
	@GetMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return"Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@GetMapping("/daikichi/{travel}")
	public String travel(
			@PathVariable("travel")String travel)
	{
	return "Congratulations! You will soon travel to " + travel;	
	}
	
	@GetMapping("daikichi/lotto/{lotto}")
	public String lotto(
			@PathVariable("lotto")Integer lotto)
	{
		if (lotto % 2 == 1) {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
		return "You will take a grand journey in the near future, but be wary of temping offers";
	}

}
