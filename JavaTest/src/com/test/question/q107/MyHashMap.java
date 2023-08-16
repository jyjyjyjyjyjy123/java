package com.test.question.q107;

import java.util.Arrays;

public class MyHashMap {
	private String[] list;
	private String[] keyList;
	private int index;
	
	public MyHashMap() {
		this.index = 0;
		this.list = new String[4];
		this.keyList = new String[4];
	}
	
	public String put(String key, String value) {
		for (int i = 0; i < index; i++) {
			if (this.keyList[i].equals(key)) {
				this.list[i] = value; 
				return null;
			}
		}
		upList();
		this.keyList[this.index] = key;
		this.list[this.index] = value;
		this.index++;
		return null;
	}
	public String get(String key) {
		for (int i = 0; i < index; i++) {
			if (this.keyList[i].equals(key)) {
				return this.list[i];
			}
		}
		return null;
	}
	public int size() {
		return index;
	}
	public String remove(String key) {
		for (int i = 0; i < index; i++) {
			if (this.keyList[i].equals(key)) {
				return this.list[i]=null;
			}
		}
		for (int i = index; i < list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		for (int i = index; i < keyList.length-1; i++) {
			this.keyList[i] = this.keyList[i+1];
		}
		this.index--;
		return null;
	}
	public boolean containKey(String key) {
		for (int i = 0; i < index; i++) {
			if (this.keyList[i].equals(key)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	public boolean containsValue(String value) {
		for (int i = 0; i < index; i++) {
			if (this.list[i].equals(value)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public void clear() {
		this.list = new String[this.list.length];
		this.keyList = new String[this.keyList.length];
		this.index = 0;
	}
	
	public void trimToSize() {
		//8칸 = 4개사용중
		String[] listCopy = new String[this.index];
		String[] keyListCopy = new String[this.index];
		//4칸 = 가득
		for (int i = 0; i < index; i++) { 
			listCopy[i] = this.list[i];
			keyListCopy[i] = this.keyList[i];
		}
		this.list = listCopy;
		this.keyList = keyListCopy;
	}
	
	public void upList() {
		if(this.index == this.keyList.length) {
			String[] listCopy = new String[this.index*2];
			String[] keyListCopy = new String[this.index*2];
			for (int i = 0; i < index; i++) {
				listCopy[i] = this.list[i];
				keyListCopy[i] = this.keyList[i];				
			}
			this.list = listCopy;
			this.keyList = keyListCopy;
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
