package com.test.question.q92;

public class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;
	private boolean test = true;
	private char c;

	//getter, setter

	public String info() {
		if (test == true){
			String temp = "";
			temp += "제목: " + this.title;
			temp += "\n가격: " + this.price +"원";
			temp += "\n저자: " + this.author;
			temp += "\n출판사: " + this.publisher;
			temp += "\n발행년도: " + this.pubYear +"년";
			temp += "\nISBN: " + this.isbn;
			temp += "\n페이지: " + this.page +"장";
			return temp;
		} else {
			return "";
		}
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() <= 50) {
			for (int i = 0; i < title.length(); i++ ) {
				c = title.charAt(i);
				if ((c<'가'||'힣'<c)&&('a'>c&&c>'z')&&('A'>c && c>'Z')&&('0'>c||c>'9')&&c!=' ') {
					System.out.println("한글, 영어, 숫자, 공백만 가능합니다.");
					this.test = false;
					break;
				}
			}
			this.title = title;
		} else {
			System.out.println("제목은 최대 50자까지 가능합니다.");
			this.test = false;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (0 <= price && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("가격은 0원 ~ 1,000,000원 까지 가능합니다");
			this.test = false;			
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page > 0) {
			this.page = page;
		} else {
			System.out.println("페이지 수는 최소 1장이상 가능합니다.");
			this.test = false;
		}
	}

	public String getPubYear() {
		return pubYear;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}