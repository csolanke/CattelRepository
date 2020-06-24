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
	private double sellingPrice;
    private String currentStatus;
    private String purchaseDate;
    private String SoldDate;
    private boolean IsMilkProducingCattle;
    private boolean IsPregnantCattle;
    private String laganDate;
    private String ExpectedDeliveryDate;
    private String gender;
    private int vet;


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

	public boolean isIsMilkProducingCattle() {
		return IsMilkProducingCattle;
	}

	public void setIsMilkProducingCattle(boolean isMilkProducingCattle) {
		IsMilkProducingCattle = isMilkProducingCattle;
	}

	public boolean isIsPregnantCattle() {
		return IsPregnantCattle;
	}

	public void setIsPregnantCattle(boolean isPregnantCattle) {
		IsPregnantCattle = isPregnantCattle;
	}

	public String getLaganDate() {
		return laganDate;
	}

	public void setLaganDate(String laganDate) {
		this.laganDate = laganDate;
	}

	public String getExpectedDeliveryDate() {
		return ExpectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(String expectedDeliveryDate) {
		ExpectedDeliveryDate = expectedDeliveryDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getVet() {
		return vet;
	}

	public void setVet(int vet) {
		this.vet = vet;
	}
	
	

}
