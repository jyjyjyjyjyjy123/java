package com.test.question;

public class Q101 {
	public static void main(String[] args) {
		//바리스타
		Barista barista = new Barista();

		//손님 1
		//에스프레소 1잔 주문 - 원두 30g
		System.out.println("손님1");
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();

		//손님 2
		//라테 1잔 주문 - 원두 30g, 우유 250ml
		System.out.println("손님2");
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();

		//손님 3
		//아메리카노 1잔 주문 - 원두 30g, 물 300ml, 각얼음 20개
		System.out.println("손님3");
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();

		//손님 4
		//에스프레소 10잔 주문 - 원두 25g
		System.out.println("손님4");
		Espresso[] e2 = barista.makeEspressoes(25, 10);

		for (Espresso e : e2) {
		      e.drink();
		}

		//손님 5
		//라테 5잔 주문 - 원두 25g, 우유 300ml
		System.out.println("손님5");
		Latte[] l2 = barista.makeLattes(25, 300, 5);

		for (Latte l : l2) {
		      l.drink();
		}

		//손님 6
		//아메리카노 15잔 주문 - 원두 20g, 물 350ml, 각얼음 30개
		System.out.println("손님6"
				+ "");
		Americano[] a2 = barista.makeAmericanos(20, 350, 30, 15);

		for (Americano a : a2) {
		      a.drink();
		}

		//결산
		barista.result();
	}
}
class Barista{
	public Espresso makeEspresso(int bean) {
		Espresso espresso = new Espresso(bean);
		Coffee.espressoSum(bean);
		return espresso;
	}
	public Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] espressoes = new Espresso[count];
		for (int i = 0; i < count; i++) {
			Espresso espresso = new Espresso(bean);
			Coffee.espressoSum(bean);
			espressoes[i] = espresso;
		}
		return espressoes;
		
	}
	public Latte makeLatte(int bean, int milk) {
		Latte latte = new Latte(bean, milk);
		Coffee.latteeSum(bean,milk);
		return latte;
	}
	public Latte[] makeLattes(int bean, int milk, int count) {
		Latte lattes[] = new Latte[count];
		for (int i = 0; i < count; i++) {
			Latte latte = new Latte(bean, milk);
			Coffee.latteeSum(bean,milk);
			lattes[i] = latte;
		}
		return lattes;
	}
	public Americano makeAmericano(int bean, int water, int ice) {
		Americano americano = new Americano(bean, water, ice);
		Coffee.americanoSum(bean, water, ice);
		return americano;
	}
	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] americanos = new Americano[count];
		for (int i = 0; i < count; i++) {
			Americano americano = new Americano(bean, water, ice);
			Coffee.americanoSum(bean, water, ice);
			americanos[i] = americano;
		}
		return americanos;
	}
	public void result(){
		
		System.out.println("=================================");
		System.out.println("             판매 결과");
		System.out.println("=================================");
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("            음료 판매량");
		System.out.printf("에스프레소: %,d잔\n",Coffee.getEspressocount());
		System.out.printf("아메리카노: %,d잔\n",Coffee.getAmericanocount());
		System.out.printf("라떼: %,d잔\n",Coffee.getLattecount());
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("            원자재 소비량 ");
		System.out.printf("원두: %,dg\n",Coffee.getBeanUnitPrice());
		System.out.printf("물: %,dml\n",Coffee.getWaterUnitPrice());
		System.out.printf("얼음: %,d개\n",Coffee.getIceUnitPrice());
		System.out.printf("우유: %,dml\n",Coffee.getMilkUnitPrice());
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("            음료 판매량");
		System.out.printf("원두: %,d원\n",Coffee.getBeanTotalPrice());
		System.out.printf("물: %,d원\n",Coffee.getWaterTotalPrice());
		System.out.printf("얼음: %,d원\n",Coffee.getIceTotalPrice());
		System.out.printf("우유: %,d원\n",Coffee.getMilkTotalPrice());
		System.out.println("---------------------------------");
	}
	
}
class Espresso{
	private int bean;
	Espresso(int bean){
		this.bean = bean;
	}
	public int getBean() {
		return bean;
	}
	public void setBean(int bean) {
		this.bean = bean;
	}
	public void drink() {
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.\n",bean);
	}
}
class Latte{
	private int bean;
	private int milk;
	Latte(int bean, int milk){
		this.bean = bean;
		this.milk = milk;
	}
	public int getBean() {
		return bean;
	}
	public void setBean(int bean) {
		this.bean = bean;
	}
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml로 만들어진 라떼를 마십니다.\n",this.bean, this.milk);
	}
}
class Americano{
	private int bean;
	private int water;
	private int ice;
	Americano(int bean, int water, int ice){
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}
	public int getBean() {
		return bean;
	}
	public void setBean(int bean) {
		this.bean = bean;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getIce() {
		return ice;
	}
	public void setIce(int ice) {
		this.ice = ice;
	}
	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.\n",this.bean, this.water, this.ice);
	}
}
class Coffee{
	private static int bean;
	private static int water;
	private static int ice;
	private static int milk;
	private static int beanUnitPrice;
	private static int waterUnitPrice;
	private static int iceUnitPrice;
	private static int milkUnitPrice;
	private static int beanTotalPrice;
	private static int waterTotalPrice;
	private static int iceTotalPrice;
	private static int milkTotalPrice;
	private static int americanocount;
	private static int lattecount;
	private static int espressocount;
	public static void espressoSum(int bean) {
		Coffee.setEspressocount(1);
		Coffee.setBeanUnitPrice(bean);
		Coffee.setBeanTotalPrice(bean);
	}
	public static void americanoSum(int bean, int water, int ice) {
		Coffee.setAmericanocount(1);
		Coffee.setBeanUnitPrice(bean);
		Coffee.setBeanTotalPrice(bean);
		Coffee.setWaterUnitPrice(water);
		Coffee.setWaterTotalPrice((int)(water*0.2));
		Coffee.setIceUnitPrice(ice);
		Coffee.setIceTotalPrice(ice*3);
	}
	public static void latteeSum(int bean, int milk) {
		Coffee.setLattecount(1);
		Coffee.setBeanUnitPrice(bean);
		Coffee.setBeanTotalPrice(bean);
		Coffee.setMilkUnitPrice(milk);
		Coffee.setMilkTotalPrice(milk*4);
	}
	public static int getBean() {
		return bean;
	}
	public static void setBean(int bean) {
		Coffee.bean = bean;
	}
	public static int getWater() {
		return water;
	}
	public static void setWater(int water) {
		Coffee.water = water;
	}
	public static int getIce() {
		return ice;
	}
	public static void setIce(int ice) {
		Coffee.ice = ice;
	}
	public static int getMilk() {
		return milk;
	}
	public static void setMilk(int milk) {
		Coffee.milk = milk;
	}
	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}
	public static void setBeanUnitPrice(int beanUnitPrice) {
		Coffee.beanUnitPrice += beanUnitPrice;
	}
	public static int getWaterUnitPrice() {
		return waterUnitPrice;
	}
	public static void setWaterUnitPrice(int waterUnitPrice) {
		Coffee.waterUnitPrice += waterUnitPrice;
	}
	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}
	public static void setIceUnitPrice(int iceUnitPrice) {
		Coffee.iceUnitPrice += iceUnitPrice;
	}
	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}
	public static void setMilkUnitPrice(int milkUnitPrice) {
		Coffee.milkUnitPrice += milkUnitPrice;
	}
	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	public static void setBeanTotalPrice(int beanTotalPrice) {
		Coffee.beanTotalPrice += beanTotalPrice;
	}
	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}
	public static void setWaterTotalPrice(int waterTotalPrice) {
		Coffee.waterTotalPrice += waterTotalPrice;
	}
	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}
	public static void setIceTotalPrice(int iceTotalPrice) {
		Coffee.iceTotalPrice += iceTotalPrice;
	}
	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static void setMilkTotalPrice(int milkTotalPrice) {
		Coffee.milkTotalPrice += milkTotalPrice;
	}
	public static int getAmericanocount() {
		return americanocount;
	}
	public static void setAmericanocount(int americanocount) {
		Coffee.americanocount += americanocount;
	}
	public static int getLattecount() {
		return lattecount;
	}
	public static void setLattecount(int lattecount) {
		Coffee.lattecount += lattecount;
	}
	public static int getEspressocount() {
		return espressocount;
	}
	public static void setEspressocount(int espressocount) {
		Coffee.espressocount += espressocount;
	}
}