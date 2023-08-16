package com.test.question.q104;

import java.util.Arrays;

public class MyArrayList {
	private String[] list;
	private int index;
	
	public MyArrayList() {
		this.index = 0;
		this.list = new String[4];
	}	
	
	public boolean add(String value) {
		try {
			upList();
			this.list[this.index] = value;
			this.index++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String get(int index) {
		indexCheck(index);
		return this.list[index];
	}
	
	public int size() {
		return this.index;
	}
	
	public String set(int index, String value) {
		indexCheck(index);
		upList();
		return this.list[index] = value;	
	}
	
	public String remove(int index) {
		for (int i = index; i < list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;
		return "";
	}
	
	public boolean add(int index, String value) {
		try {
			indexCheck(index);
			upList();
			for (int i = this.list.length-1; i > index; i--) {
				this.list[i] = this.list[i-1];
			}
			this.list[index] = value;
			this.index++;
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public int indexOf(String value) {
		for (int i = 0; i < index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public int indexOf(String value, int beginIndex) {
		for (int i = beginIndex; i < index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(String value) {
		for (int i = index-1; i >= 0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(String value, int beginIndex) {
		for (int i = beginIndex; i >= 0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean contains(String value) {
		for (int i = 0; i < this.index; i++) {
			if (this.list[i].equals(value)) {
				return true;
			}
		}
		return false;
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
	
	public void indexCheck(int index) {
		if (index < 0 || index >= this.index) {
			throw new IndexOutOfBoundsException();
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
