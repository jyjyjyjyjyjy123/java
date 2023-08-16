package com.test.question.q96;

public class Macaron {
	private int size;
	private String color;
	private int thickness;
	
	public int getSize() {
		return size;
	}
	public void setSize() {
		this.size = (int)(Math.random()*10)+5;
	}
	public String getColor() {
		return color;
	}
	public void setColor() {
		String[] colors = {"red","blue","yellow","white","pink","purple","green","black"};
		this.color = colors[(int)(Math.random()*colors.length)]; 
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness() {
		this.thickness = (int)(Math.random()*20)+1;
	}
}
