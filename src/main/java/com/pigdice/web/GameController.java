package com.pigdice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pigdice.business.GameRepository;

@Controller
@RequestMapping(path="/Game")
public class GameController {
	@Autowired
	public GameRepository gameRepo;
	
}
