package com.example.SpringBootKafkaIntegrationEx.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringBootKafkaIntegrationEx.entity.Stock;
import com.example.SpringBootKafkaIntegrationEx.repo.StockRepository;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageStore {
	
	@Autowired
	private StockRepository repo;
	
	public void save(Stock stock) {
		System.out.println("inside message store to save message " + stock);
		repo.save(stock);
	}
	
	public List<Stock> fetchAll(){
		System.out.println("inside message store to fetch");
		return repo.findAll();
	}

}
