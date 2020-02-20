package com.epam.Task2;

/**
 * Hello world!
 *
 */
public abstract class NYGift
{
    private String giftname;
    private int giftqty;
    public NYGift(String name,int qty) {
    	giftname=name;
    	giftqty=qty;
    }
    public void setGName(String x) {
    	giftname=x;
    }
    public String getGName() {
    	return giftname;
    }
    public void setGQty(int y) {
    	giftqty=y;
    }
    public int getGQty() {
    	return giftqty;
    }
    abstract void wrap(); 	

}