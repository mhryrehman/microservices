package com.example.SpringBootKafkaIntegrationEx.util;

import org.springframework.stereotype.Component;

import com.example.SpringBootKafkaIntegrationEx.entity.Stock;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonUtil {

	public String converObjectToString(Stock stock) {
		String str=null;

		try {
			str = new ObjectMapper().writeValueAsString(stock);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	public Stock converStringToObject(String json) {
		Stock obj=null;

		try {
			obj = new ObjectMapper().readValue(json, Stock.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

}
