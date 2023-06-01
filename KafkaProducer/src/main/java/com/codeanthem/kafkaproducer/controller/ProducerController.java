package com.codeanthem.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codeanthem.kafkaproducer.service.ProducerService;

@RestController
@RequestMapping("/rest/api")
public class ProducerController {

	@Autowired
	ProducerService producerService;
	
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producerService.sendMsgToTopic(message);
	}
}