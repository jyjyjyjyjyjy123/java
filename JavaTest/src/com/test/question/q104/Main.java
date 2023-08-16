package com.test.question.q104;

public class Main {
	public static void main(String[] args) {
		//배열 생성
		MyArrayList list = new MyArrayList();
		//추가
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");
		list.add("555");
		System.out.println(list);
		System.out.println();
		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println();
		//개수
		System.out.println(list.size());
		System.out.println();
		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		//수정
		list.set(0, "하하하");
		System.out.println(list.get(0));
		System.out.println(list);
		System.out.println();
		
		//삭제
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println(list);
		System.out.println();
		//삽입
		list.add(1, "호호호");
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
		System.out.println(list);
		System.out.println();
		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}
		System.out.println(list.lastIndexOf("호호호"));
		System.out.println(list.indexOf("호호호",3));
		System.out.println(list.lastIndexOf("호호호",3));
		System.out.println(list.contains("호호호"));
		System.out.println();
		
		//
		list.trimToSize();
		System.out.println(list);
		System.out.println();
		//초기화
		list.clear();
		System.out.println(list.size());
		System.out.println(list);
	}
}
