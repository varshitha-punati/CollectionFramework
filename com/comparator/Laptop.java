package com.comparator;

public class Laptop implements Comparable<Laptop>{
	int price;
	String name;
	int rating;
	Laptop(int Price,String Name,int Rating){
		
		this.price=Price;
		this.name=Name;
		this.rating=Rating;
	}
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", name=" + name + ", rating=" + rating + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	
	//Descending sort
//	public int compareTo(Laptop lap) {
//		// TODO Auto-generated method stub
//		if(this.getPrice()>lap.getPrice()) 
//			return 1;
//		else
//			return -1;
//	}
	
	//Descending sort
	public int compareTo(Laptop lap) {
		// TODO Auto-generated method stub
		if(this.getPrice()>lap.getPrice()) 
			return -1;
		else
			return 1;
	}
}
