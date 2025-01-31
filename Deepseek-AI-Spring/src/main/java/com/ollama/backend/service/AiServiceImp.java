package com.ollama.backend.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class AiServiceImp implements AiService {

	private ChatClient client;
	
	public AiServiceImp(ChatClient.Builder builder) {
		this.client = builder.build();
		
		
	}
	
	@Override
	public String askAi(String question) {
		return client.prompt(question).call().content();
	}
	
	@Override
	public Flux<String> streamResponse(String question){
		return this.client.prompt().user(question).stream().content();
	}

	
	
	

}
