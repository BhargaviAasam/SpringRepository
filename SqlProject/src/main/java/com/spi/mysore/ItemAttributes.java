package com.spi.mysore;

public class ItemAttributes {
	
	private int item_attribute_id;
	private String item_name;
	private String color;
	private String size;
	private float price;
	public int getItem_attribute_id() {
		return item_attribute_id;
	}
	public void setItem_attribute_id(int item_attribute_id) {
		this.item_attribute_id = item_attribute_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public ItemAttributes(){
		
	}
/*public ItemAttributes( String s, int price){
		
	}
*/
}
