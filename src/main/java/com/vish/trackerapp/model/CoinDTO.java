/* Viswanadh Bhaskarla - Tracker app | Spring MVC | coinrank API Integration */

package com.vish.trackerapp.model;

import org.springframework.stereotype.Component;

@Component
public class CoinDTO {
	private String name;
	private String symbol;
	private String url;
	private float price;
	private float change;
	
	private int rank;
	private String marketCap;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getChange() {
		return change;
	}
	
	public void setChange(float change) {
		this.change = change;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(String string) {
		this.marketCap = string;
	}
	
	@Override
	public String toString() {
		return "CoinDTO [name=" + name + ", symbol=" + symbol + ", url=" + url + ", price=" + price + ", change="
				+ change + ", rank=" + rank + ", marketCap=" + marketCap + "]";
	}
}
