package com.example.SpringBootKafkaIntegrationEx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootKafkaIntegrationEx.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

}
