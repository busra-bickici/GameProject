package Entities;

import Concrete.CampaingManager;

public class Game  {
	
	private int id;
	private String name;
	double unitPrice;
	private double priceAfterDiscount;
	
	public Game() {
		
	}

	public Game(int id, String name, double unitPrice,double priceAfterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.priceAfterDiscount = priceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getPriceAfterDiscount(Campaign campaign) {
		priceAfterDiscount = unitPrice - (unitPrice * campaign.getDiscount() / 100);
		return priceAfterDiscount;
	}
}	
	
	
