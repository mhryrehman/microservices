package com.example.SpringBootKafkaIntegrationEx.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootKafkaIntegrationEx.entity.Stock;
import com.example.SpringBootKafkaIntegrationEx.service.ProducerService;
import com.example.SpringBootKafkaIntegrationEx.store.MessageStore;

@RestController
@RequestMapping("/")
public class KafkaRestController {
	
	@Autowired
	ProducerService producerService;
	@Autowired
	MessageStore store;
	
	@GetMapping("/send")
	public String readDetails(@RequestParam String scode, @RequestParam Double scost){
		Stock stock = new Stock();
		stock.setStockCode(scode);
		stock.setStockCost(scost);
		producerService.send(stock);
		return "SENT SUCCESS";
	}
	
	@GetMapping("/all")
	public List<Stock> fetchAll(){
		return store.fetchAll();
	}
	
	@GetMapping("/test")
	public String test(){
		return "this is test";
	}

}
