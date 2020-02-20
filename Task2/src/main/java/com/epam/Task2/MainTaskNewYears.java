package com.epam.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainTaskNewYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> req=new ArrayList<String>();
		int ans=1,ch=1,start=0;
		NYGift[] g=new NYGift[6];
		g[0]=new AssortedSweets("Mysore pak",120);
		g[1]=new AssortedSweets("Kaju barfi",40);
		g[2]=new AssortedSweets("Rasmalai",35);
		g[3]=new Chocolates("Dairymilk",22);
		g[4]=new Chocolates("5 Star",41);
        g[5]=new Chocolates("Perk",36);
        do {
        System.out.println("Welcome!!");
        System.out.println("gifts ------------quantity");
        System.out.println("Sweets");
        for(int i=0;i<3;i++) {
        	System.out.println((i+1)+"."+g[i].getGName()+"              "+g[i].getGQty());
        }
        System.out.println("Chocolates");
        for(int i=3;i<6;i++) {
        	System.out.println((i+1)+"."+g[i].getGName()+"                "+g[i].getGQty());
        }
        System.out.println("-------------------------------------");
        System.out.println("1.Enter the range  of your choice to view gifts");
        System.out.println("2.Enter your choice to wrap the gift packs");
        System.out.println("3.sort available gifts");
        System.out.println("Enter your choice:");
        ans=sc.nextInt();
        if(ans==1) {
        	System.out.println("Enter the range between which you want the gifts");
        	start=sc.nextInt();
        	//System.out.println("Available gifts are:");
        	for(int i=0;i<6;i++) {
        		if(g[i].getGQty()>=start) {
        			req.add(g[i].getGName());
        		}
        	}
        	if(req.isEmpty()) {
        		System.out.println("Sorry,no gifts found in the given range!!");
        		//break;
        	}
        	else {
        		System.out.println("Gifts available in the given range are:");
        		Iterator<String> itr=req.iterator();
        		while(itr.hasNext()) {
        			System.out.println(itr.next());
        		}   
			float weight=(float) (start/10.0);
			System.out.println("Total weight of sweets selected"+weight+"kg");
        	}
        }
        else if(ans==2) {
        	sc.nextLine();
        	System.out.println("Enter the name of the gift:");
        	String c=sc.nextLine();
        	int h=0;
        	for(int j=0;j<6;j++) {
        		if(g[j].getGName().equalsIgnoreCase(c)) {
        			g[j].wrap();
        			h=1;
                    break;
        		}
        	}
        	if(h==0)
        	{
        		System.out.println("entered gift not found! please enter the available gift");
        	}
        }
        else if(ans==3) {
        	NYGift temp;
        	for (int i = 1; i < g.length; i++) {
        	    for (int j = i; j > 0; j--) {
        	     if (g[j].getGQty() < g [j - 1].getGQty()) {
        	      temp = g[j];
        	      g[j] = g[j - 1];
        	      g[j - 1] = temp;
        	     }
        	    }
        	   }
        	   for (int i = 0; i < g.length; i++) {
        	     System.out.println(g[i].getGName());
        	   }
        }
        else {
        	System.out.println("Enter a valid chocie");
        }
        System.out.println("Do you want to continue?Yes(1)/No(0)");
        ch=sc.nextInt();
	}while(ch==1);
        System.out.println("make sure you come again!!");
        sc.close();
}
}