package com.ameydairyproducts.dto;

public class CattleDTO {

	private int id;
	private String cattleName;
	private String marketPurchased;
	private String breed;
	private double pricePurchased;
	private int numOfKids;
	private String uniqueIdentity;
	private double milkingCapacity;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCattleName() {
		return cattleName;
	}

	public void setCattleName(String cattleName) {
		this.cattleName = cattleName;
	}

	public String getMarketPurchased() {
		return marketPurchased;
	}

	public void setMarketPurchased(String marketPurchased) {
		this.marketPurchased = marketPurchased;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getPricePurchased() {
		return pricePurchased;
	}

	public void setPricePurchased(double pricePurchased) {
		this.pricePurchased = pricePurchased;
	}

	public int getNumOfKids() {
		return numOfKids;
	}

	public void setNumOfKids(int numOfKids) {
		this.numOfKids = numOfKids;
	}

	public String getUniqueIdentity() {
		return uniqueIdentity;
	}

	public void setUniqueIdentity(String uniqueIdentity) {
		this.uniqueIdentity = uniqueIdentity;
	}

	public double getMilkingCapacity() {
		return milkingCapacity;
	}

	public void setMilkingCapacity(double milkingCapacity) {
		this.milkingCapacity = milkingCapacity;
	}

}
