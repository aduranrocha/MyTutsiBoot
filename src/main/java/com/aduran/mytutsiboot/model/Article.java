package com.aduran.mytutsiboot.model;

import org.springframework.data.annotation.Id;

public class Article {
	@Id
	private String nameArticle;
	private String brandArticle;	
	private float price;
	
	public Article() {}
	
	public String getNameArticle() {
		return nameArticle;
	}
	public void setNameArticle(String nameArticle) {
		this.nameArticle = nameArticle;
	}
	public String getBrandArticle() {
		return brandArticle;
	}
	public void setBrandArticle(String brandArticle) {
		this.brandArticle = brandArticle;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
