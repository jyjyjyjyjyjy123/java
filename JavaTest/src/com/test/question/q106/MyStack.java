package com.test.question.q106;

import java.util.Arrays;

public class MyStack {
	private String[] list;
	private int index;
	
	public MyStack() {
		this.index = 0;
		this.list = new String[4];
	}
	
	public boolean push(String value) {
		try {
			upList();
			this.list[this.index] = value;
			this.index++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String pop() {
		if (index != 0) {
			this.index--;
			String text = this.list[index];
			this.list[index] = null;
			return text;
		}else {
			return "";
		}
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		return this.list[index-1];
	}
	
	public void clear() {
		this.list = new String[this.list.length];
		this.index = 0;
	}
	
	public void trimToSize() {
		String[] listCopy = new String[this.index];
		for (int i = 0; i < index; i++) {
			listCopy[i] = this.list[i];
		}
		this.list = listCopy;
	}
	
	public void upList() {
		if(this.index == this.list.length) {
			String[] listCopy = new String[this.index*2];
			for (int i = 0; i < index; i++) {
				listCopy[i] = this.list[i];
			}
			this.list = listCopy;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("length: %d\n", this.list.length));
		sb.append(String.format("index: %d\n", this.index));
		sb.append(Arrays.toString(list));
		return sb.toString();
	}
	
}
