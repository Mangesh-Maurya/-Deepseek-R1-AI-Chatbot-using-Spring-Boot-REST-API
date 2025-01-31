package com.ollama.backend.service;

import reactor.core.publisher.Flux;

public interface AiService {
	
	String askAi(String question);
	
	Flux<String> streamResponse(String question);

}
