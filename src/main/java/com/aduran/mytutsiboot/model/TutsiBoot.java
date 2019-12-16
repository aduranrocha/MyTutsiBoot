package com.aduran.mytutsiboot.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class TutsiBoot {
	@Id
	private String idBoot;
	private String nameBoot;
	private Character sizeBoot;
	private String colorBoot;
	private Float weigth;
	private List<Article> articles;
	

	public TutsiBoot() {}
	
	public String getIdBoot() {
		return idBoot;
	}
	public void setIdBoot(String idBoot) {
		this.idBoot = idBoot;
	}
	public String getNameBoot() {
		return nameBoot;
	}
	public void setNameBoot(String nameBoot) {
		this.nameBoot = nameBoot;
	}
	public Character getSizeBoot() {
		return sizeBoot;
	}
	public void setSizeBoot(Character sizeBoot) {
		this.sizeBoot = sizeBoot;
	}
	public String getColorBoot() {
		return colorBoot;
	}
	public void setColorBoot(String colorBoot) {
		this.colorBoot = colorBoot;
	}
	public Float getWeigth() {
		return weigth;
	}
	public void setWeigth(Float weigth) {
		this.weigth = weigth;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}
