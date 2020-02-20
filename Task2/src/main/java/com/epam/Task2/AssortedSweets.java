package com.epam.Task2;

public class AssortedSweets extends NYGift {
	public AssortedSweets(String sname,int sqty) {
		super(sname,sqty);
	}
	@Override
	void wrap() {
		System.out.println(this.getGName()+" is gift wrapped!");
	}

}
