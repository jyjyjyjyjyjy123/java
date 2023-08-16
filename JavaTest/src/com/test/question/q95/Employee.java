package com.test.question.q95;

public class Employee {
	 private String name;
	 private String department;
	 private String position;
	 private String tel;
	 private Employee boss;
	 boolean test = true;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (2 > name.length() && name.length() > 5) {
			System.out.println("2~5자 이내만 가능합니다.");
			return;
		}
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (c < '가' || c > '힣'){
				System.out.println("한글만 입력가능합니다.");
				test = false;
				return;
			}
		}
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		if (department.equals("영업부")
				||department.equals("기획부")
				||department.equals("총무부")
				||department.equals("개발부")
				||department.equals("홍보부")) {
			this.department = department;
		}else {
			System.out.println("잘못된 부서명 입니다.");
			test = false;
			return;
		}
		
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		if (position.equals("부장")
				||position.equals("과장")
				||position.equals("대리")
				||position.equals("사원")) {
			this.position = position;
		}else {
			System.out.println("잘못된 직책 입니다.");
			test = false;
			return;
		}
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		String[] testTel = tel.split("-");
		if (testTel[0].equals("010") && testTel[1].length() == 4 && testTel[2].length() == 4) {
			this.tel = tel;
		} else {
			System.out.println("잘못된 연락처 입니다");
			test = false;
			return;
		}
	}
	public Employee getBoss() {
		return boss;
	}
	public void setBoss(Employee boss) {
		if (boss == null) {
			return;
		}
		if (!this.department.equals(boss.department)) {
			System.out.println("같은 부서의 상사만 가능합니다.");
			test = false;
			return;
		}
		this.boss = boss;
			
	}
	public String info() {
		if (test == true) {
			String temp = "";
			temp += "[" + this.name + "]"; 
			temp += "\n부서:" + this.department;
			temp += "\n직위:" + this.position;
			temp += "\n연락처:" + this.tel;
			if (this.boss == null) {
				temp += "\n직속상사: 없음";
			}else {temp += "\n직속상사:" + this.boss.getName()+"("+this.boss.getDepartment()+ ""+this.boss.getPosition() +")";
			}
			System.out.println(temp);
			return temp;
		}
		return "";
	}
}
