package com.test.question;

public class Q100 {
	public static void main(String[] args) {
		//포장하는 직원
		Packer packer = new Packer();

		//연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		//결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
	}
}
class Packer{
	private static int pencilCount = 0;
	private static int eraserCount = 0;
	private static int ballPointPenCount = 0;
	private static int rulerCount = 0;
	public void packing(Pencil pencil) {
		Pencil p = pencil;
		if (p.getHardness().equals("4B")||
			p.getHardness().equals("3B")||
			p.getHardness().equals("2B")||
			p.getHardness().equals("B") ||
			p.getHardness().equals("HB")||
			p.getHardness().equals("H") ||
			p.getHardness().equals("2H")||
			p.getHardness().equals("3H")||
			p.getHardness().equals("4H")) {
			System.out.printf("포장 전 검수 : %s 진하기 연필입니다.\n", p.getHardness());
			System.out.println("포장을 완료했습니다.");
			Packer.pencilCount++;
		} else {
			System.out.println("포장 전 검수 : 불량");
		}
	}
	public void packing(Eraser eraser) {
		Eraser e = eraser;
		if (e.getSize().equals("Large")||
			e.getSize().equals("Medium")||
			e.getSize().equals("Small")) {
			System.out.printf("포장 전 검수 : %s 사이즈 지우개입니다.\n", e.getSize());
			System.out.println("포장을 완료했습니다.");
			Packer.eraserCount++;
		}else {
			System.out.println("포장 전 검수 : 불량");
		}
		
	}
	public void packing(BallPointPen ballPointPen) {
		BallPointPen b = ballPointPen;
		if (b.getThickness() == 0.3||
			b.getThickness() == 0.5||
			b.getThickness() == 0.7||
			b.getThickness() == 1.0||
			b.getThickness() == 1.5) {
			if (b.getColor().equals("red")||
				b.getColor().equals("blue")||
				b.getColor().equals("green")||
				b.getColor().equals("black")) {
				System.out.printf("포장 전 검수 : %s 색상 %.1fmm 볼펜입니다.\n", b.getColor(), b.getThickness());
				System.out.println("포장을 완료했습니다.");
				Packer.ballPointPenCount++;
			}else {
				System.out.println("포장 전 검수 : 불량");
			}
		}else {
			System.out.println("포장 전 검수 : 불량");
		}
	}
	public void packing(Ruler ruler) {
		Ruler r = ruler;
		if (r.getLength() == 30||
			r.getLength() == 50||
			r.getLength() == 100) {
			if (r.getShape().equals("줄자")||
				r.getShape().equals("운형자")||
				r.getShape().equals("삼각자")) {
				System.out.printf("포장 전 검수 : %dcm %s입니다.\n", r.getLength(), r.getShape());
				System.out.println("포장을 완료했습니다.");
				Packer.rulerCount++;
			}else {
				System.out.println("포장 전 검수 : 불량");
			}
		}else {
			System.out.println("포장 전 검수 : 불량");
		}
	}
	public void countPacking(int type) {
		switch (type) {
		case 0:
			System.out.println("=====================");
			System.out.println("포장 결과");
			System.out.println("=====================");
			System.out.println("연필 "+Packer.pencilCount+"회");
			System.out.println("지우개 "+Packer.eraserCount+"회");
			System.out.println("볼펜 "+Packer.ballPointPenCount+"회");
			System.out.println("자 "+Packer.rulerCount+"회");
			break;
		case 1:
			System.out.println("=====================");
			System.out.println("포장 결과");
			System.out.println("=====================");
			System.out.println("연필 "+Packer.pencilCount+"회");
			break;
		case 2:
			System.out.println("=====================");
			System.out.println("포장 결과");
			System.out.println("=====================");
			System.out.println("지우개 "+Packer.eraserCount+"회");
			break;
		case 3:
			System.out.println("=====================");
			System.out.println("포장 결과");
			System.out.println("=====================");
			System.out.println("볼펜 "+Packer.ballPointPenCount+"회");
			break;
		case 4:
			System.out.println("=====================");
			System.out.println("포장 결과");
			System.out.println("=====================");
			System.out.println("자 "+Packer.rulerCount+"회");
			break;
		default:
			break;
		}
		
	}
	
}
class Pencil{
	private String hardness;

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}
	
}
class Eraser{
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
class BallPointPen{
	private double thickness;
	private String color;
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
class Ruler{
	private int length;
	private String shape;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
}