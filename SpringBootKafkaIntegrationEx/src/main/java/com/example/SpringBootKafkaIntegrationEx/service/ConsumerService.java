package com.example.SpringBootKafkaIntegrationEx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.SpringBootKafkaIntegrationEx.entity.Stock;
import com.example.SpringBootKafkaIntegrationEx.store.MessageStore;
import com.example.SpringBootKafkaIntegrationEx.util.JsonUtil;

@Component
public class ConsumerService {
	
	@Autowired
	JsonUtil util;
	
	@Autowired
	private MessageStore store;
	
	@KafkaListener(topics = "${kafka-topic-name}", groupId = "group-id")
	public void readMessage(String message) {
		System.out.println("Message recieved at consumer : " + message);
		Stock stock = util.converStringToObject(message);
		store.save(stock);
	}
	
//	@KafkaListener(topics = "${kafka-topic-name}", groupId = "group-id")
//	public void readMessage(Stock stock) {
//		System.out.println("Message recieved at consumer : " + stock);
//		store.save(stock);
//	}

}
