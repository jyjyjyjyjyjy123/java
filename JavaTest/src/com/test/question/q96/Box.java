package com.test.question.q96;

public class Box {
	private Macaron[] list = new Macaron[10];
	String[] check = new String[10];

	public void cook() {
		for (int i = 0; i < list.length; i++) {
			Macaron macaron = new Macaron();
			macaron.setSize();
			macaron.setColor();
			macaron.setThickness();
			this.list[i] = macaron;
		}
		System.out.printf("마카롱을 %d개 만들었습니다\n",list.length);
	}
	public void check() {
		int pass = 0;
		int fail = 0;
		for (int i = 0; i < list.length; i++) {
			if (8 <= list[i].getSize() && list[i].getSize() <= 14 &&
				3 <= list[i].getThickness() && list[i].getThickness() <= 18 &&
				!list[i].getColor().equals("black")) {
				check[i] = "합격";
				pass += 1;
			}else {
				check[i] = "불합격";
				fail += 1;
			}
		}
		System.out.println("QC 합격 개수: " + pass);
		System.out.println("QC 불합격 개수: " + fail);
	}
	public void list() {
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%2d번 마카롱 : %dcm(%s, %dmm):%s\n", i+1, 					
					list[i].getSize(),
					list[i].getColor(),
					list[i].getThickness(),
					check[i]);			
		}
	   }
}
