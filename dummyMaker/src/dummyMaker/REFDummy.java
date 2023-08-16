package dummyMaker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class REFDummy {
	public static void main(String[] args) throws IOException {
		ArrayList<REFinfo> list = new ArrayList<REFinfo>();//중복검사용
		Random rnd = new Random();//랜덤
		//제품번호, 카테고리, 기업명, 제품명, 색상,형태 등...
		
		//기업명
		String[] enterprise = {"바이마트", "가전의모든것", "헬로가전"};
		//제품명
		String[] codeCraft = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		String[] codeCraft2 = {"A", "B", "C", "D", "E", "F", "G","H","I","J","K","L","N","M",
				"O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		//색상,형태 등..
		String[] color = {"화이트", "실버", "블랙", "베이지", "블루","그린","옐로우","오렌지","레드"};
		String[] door = {"양문형 2도어","상하형 2도어", "4도어", "3도어"};
		
		//더미데이터 파일 불러오기
		BufferedWriter writer = new BufferedWriter(new FileWriter("DummyData\\REFinfo.txt"));
		BufferedWriter writer2 = new BufferedWriter(new FileWriter("DummyData\\REFmanage.txt"));
		
		//50개 생성
		for (int i=1; i<=50; i++) {
			//관리번호
			String itemCode = "REF_20230814_" + i;
			//카테고리
			String category = "냉장고";
			//기업명
			String ent = enterprise[rnd.nextInt(enterprise.length)];
			//컬러
			String colorChoice = color[rnd.nextInt(color.length)];
			//도어
			String doorChoice = door[rnd.nextInt(door.length)];
			//L
			String volume = (rnd.nextInt(40)+40)+"0";
			//제품명
			String code = "REF";
			//중간 숫자 5개 생성
			for (int j = 0; j < 5; j++) {
				code += codeCraft[rnd.nextInt(codeCraft.length)];
			}
			//마지막 알파벳 추가
			code += codeCraft2[rnd.nextInt(codeCraft2.length)];
			//중복검사
			for (REFinfo d : list) {
				if (d.getCode() == code) {
					i--;
					continue;
				}
			}
			//---------------------------------
			//관리번호, 의무사용기간, 점검주기, 월 요금
			//의무사용기간
			String dutyPeriod = "36";
			//점검주기
			String checkPeriod = "3";
			//요금
			String fee = (rnd.nextInt(30)+5)+",900";
			
			REFinfo ri = new REFinfo(itemCode, category, ent, code, colorChoice, doorChoice, volume);
			list.add(ri);
			//추가
			writer.write(String.format("%s,%s,%s,%s,%s,%s,%s\n",itemCode,category,ent,code,colorChoice,doorChoice,volume));
			writer2.write(String.format("%s,%s,%s,%s\n",itemCode, dutyPeriod, checkPeriod, fee));


		}
		writer.close();
		writer2.close();
		
		System.out.println("더미 데이터 생성 완료");
	}
}