package com.codeanthem.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	public void sendMsgToTopic(String message) {
		kafkaTemplate.send("codeDecode_Topic",message);
	}
}
