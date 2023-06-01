package com.codeanthem.kafkaproducer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServive {

	@KafkaListener(topics="codeDecode_Topic", groupId="codeDecode_group")
	public void listenToTopic(String message) {
	System.out.println("the message recieved is "+message );	
	}
	
}
