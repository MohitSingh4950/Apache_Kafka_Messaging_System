package com.codeanthem.apachekafka.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "kafka_consumer",groupId ="group_id" )
	public void consume(String message) {
		System.out.println("Consume Message : "+message);
	}
}
