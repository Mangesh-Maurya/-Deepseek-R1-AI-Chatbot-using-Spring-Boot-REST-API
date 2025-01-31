package com.ollama.backend.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ollama.backend.service.AiService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/ai")
public class AiController {
	
	private AiService aiService;

	public AiController(AiService aiService) {
		this.aiService = aiService;
	}

	@GetMapping
	public org.springframework.http.ResponseEntity<String> askAi(
			@RequestParam(value = "query",required = false, defaultValue = "How are you ? How can you help me ?")String query
			){
		
		String response = aiService.askAi(query);
		return new org.springframework.http.ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	@GetMapping("/stream")
	public Flux<String> streamAi(
			@RequestParam(value = "query",required = false, defaultValue = "How are you ? How can you help me ?")String query
			){
		
		return aiService.streamResponse(query);
		
	}

}
