package com.example.SpringBootKafkaIntegrationEx.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="stock_tab")
@Getter
@Setter
public class Stock implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sid")
    private Integer stockId;

    @Column(name="scode")
    private String stockCode;

    @Column(name="scost")
    private Double stockCost;

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public Double getStockCost() {
		return stockCost;
	}

	public void setStockCost(Double stockCost) {
		this.stockCost = stockCost;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockCode=" + stockCode + ", stockCost=" + stockCost + "]";
	}

}
