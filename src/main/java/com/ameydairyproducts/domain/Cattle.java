package com.ameydairyproducts.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cattle {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String cattleName;
    private String marketPurchased;
    private String breed;
    private double pricePurchased;
    private int numOfKids;
    private String uniqueIdentity;
    private double milkingCapacity;
    private double sellingPrice;
    private String currentStatus;
    private String purchaseDate;
    private String SoldDate;


    public Cattle() {
    }

    public Cattle(int id, String cattleName, String marketPurchased, String breed, double pricePurchased, int numOfKids, String uniqueIdentity, double milkingCapacity,
    		double sellingPrice,String currentStatus,String purchaseDate,String soldDate) {
        this.id = id;
        this.cattleName = cattleName;
        this.marketPurchased = marketPurchased;
        this.breed = breed;
        this.pricePurchased = pricePurchased;
        this.numOfKids = numOfKids;
        this.uniqueIdentity = uniqueIdentity;
        this.milkingCapacity = milkingCapacity;
        this.sellingPrice=sellingPrice;
        this.currentStatus=currentStatus;
        this.purchaseDate=purchaseDate;
        this.SoldDate=soldDate;
    }

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

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getSoldDate() {
		return SoldDate;
	}

	public void setSoldDate(String soldDate) {
		SoldDate = soldDate;
	}
    
    
    

}