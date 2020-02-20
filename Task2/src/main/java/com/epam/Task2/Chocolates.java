package com.epam.Task2;

public class Chocolates extends NYGift {
	public Chocolates(String cname,int cqty) {
		super(cname,cqty);
	}
	@Override
	void wrap() {
		System.out.println(this.getGName()+" is gift wrapped!");
	}

}
