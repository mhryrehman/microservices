package com.example.SpringBootKafkaIntegrationEx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.SpringBootKafkaIntegrationEx.entity.Stock;
import com.example.SpringBootKafkaIntegrationEx.util.JsonUtil;

@Component
public class ProducerService {
	
	@Autowired
	JsonUtil util;
	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	@Value("${kafka-topic-name}")
	private String topic;
	
	public void send(Stock stock) {
		String message = util.converObjectToString(stock);
		System.out.println("Producer service sending message to kafka : " + message);
		template.send(topic, message);
	}

}
