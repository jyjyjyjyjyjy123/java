package com.test.question.q97;

import java.util.Arrays;

public class Refrigerator {
	private Item[] items = new Item[100];
	
	int index = 0;
	
	public void add(Item item) {
		if (this.index < this.items.length) {
			this.items[index] = item;
			index++;
			System.out.println(item.getName()+"를 냉장고에 넣었습니다.");
		} else {
			System.out.println("냉장고가 꽉 찼습니다");
		}
	}
	   
	public Item get(String name) {
		Item item = null;
		int count = 0;
		for (; count < items.length; count++) {
			if (this.items[count].getName().equals(name)) {
				item = this.items[count];
				this.index --;
				break;
			}
		}
		for (int i=count; i<this.index; i++) {
			this.items[i] = this.items[i+1];
		}
		this.items[this.items.length-1] = null;
		return item;
	}

	public int count() {
		return index;
	}

	public void listItem() {
		for (int i = 0;  i< index; i++) {
			if (items[i] != null) {
				System.out.printf("%s(%s)\n",items[i].getName(),items[i].getExpiration());
			}
		}
	}
}
