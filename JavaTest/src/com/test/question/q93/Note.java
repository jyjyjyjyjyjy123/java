package com.test.question.q93;

public class Note {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price = 500;
	private String result = "";
	boolean test = true;
	String pageCount="";
	//setter, getter 구현

	public String info() {
		if (test == true&&owner != null) {
			result += "■■■■■■노트 정보■■■■■■";
			result += "\n소유자: "+ this.owner;
			result += "\n특성: "+ this.color +" "+ pageCount +" "+ size+"노트";
			result += "\n가격: "+this.price+"원";
			result += "\n■■■■■■■■■■■■■■■■■■■";
			return result;
		}else if (owner==null) {
			result += "■■■■■■노트 정보■■■■■■";
			result += "\n주인 없는 노트";
			result += "\n■■■■■■■■■■■■■■■■■■■";
			return result;
		}
		return "";
	}

	public void setSize(String size) {
		if (size.equals("A3")) {
			this.price+=400;
		}else if(size.equals("A4")) {
			this.price+=200;
		}else if(size.equals("A5")) {
		}else if(size.equals("B3")) {
			this.price+=500;
		}else if(size.equals("B4")) {
			this.price+=300;
		}else if(size.equals("B5")) {
			this.price+=100;
		} else {
			System.out.println("크기는 A3, A4, A5, B3, B4, B5만 가능합니다.");
			test = false;
			return;
		}
		this.size = size;
	}

	public void setColor(String color) {
		if (color.equals("흰색")) {
		}else if(color.equals("검정색")) {
			this.price += 100;
		}else if(color.equals("노란색")||color.equals("파란색")){
			this.price += 200;
		}else {
			System.out.println("색상은 검정색, 흰색, 노라색, 파란색만 가능합니다.");
			test = false;
			return;
		}
		this.color = color;
	}

	public void setPage(int page) {
		if(10<=page&&page<=200) {
			if (page<=50) {
				pageCount = "얇은";
			}else if(page<=100) {
				pageCount = "보통";
			}else {
				pageCount = "두꺼운";
			}				
		} else {
			System.out.println("페이지수는 10 ~ 200페이지 까지 가능합니다");
			test = false;
			return;
		}
		this.price += (page-10)*10;
		this.page = page;
	}

	public void setOwner(String owner) {
		if (2 > owner.length() && owner.length() > 5) {
			System.out.println("2~5자 이내만 가능합니다.");
			return;
		}
		for (int i = 0; i < owner.length(); i++) {
			char c = owner.charAt(i);
			if (c < '가' || c > '힣'){
				System.out.println("한글만 입력가능합니다.");
				this.owner = "";
				test = false;
				return;
			}
		}
		this.owner = owner;
	}
}
