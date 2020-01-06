package com.zq.entity;

import java.math.BigInteger;
import java.util.Date;

public class Year {

	private BigInteger id;
	private String keyWords;
	private String description;
	private String companyName;
	private String mainGoods;
	private String address;
	private String numPrice;
	private String startDate;
	private String checkDate;
	private String status;
	public Year(BigInteger id, String keyWords, String description, String companyName, String mainGoods,
			String address, String numPrice, String startDate, String checkDate) {
		super();
		this.id = id;
		this.keyWords = keyWords;
		this.description = description;
		this.companyName = companyName;
		this.mainGoods = mainGoods;
		this.address = address;
		this.numPrice = numPrice;
		this.startDate = startDate;
		this.checkDate = checkDate;
	}
	public Year() {
		super();
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getMainGoods() {
		return mainGoods;
	}
	public void setMainGoods(String mainGoods) {
		this.mainGoods = mainGoods;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumPrice() {
		return numPrice;
	}
	public void setNumPrice(String numPrice) {
		this.numPrice = numPrice;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Year [id=" + id + ", keyWords=" + keyWords + ", description=" + description + ", companyName="
				+ companyName + ", mainGoods=" + mainGoods + ", address=" + address + ", numPrice=" + numPrice
				+ ", startDate=" + startDate + ", checkDate=" + checkDate + "]";
	}
	
	

}
