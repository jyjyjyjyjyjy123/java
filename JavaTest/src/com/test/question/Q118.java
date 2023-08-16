package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q118 {
	static ArrayList<String> fileName = new ArrayList<String>();
	static ArrayList<Long> fileSize = new ArrayList<Long>();
	static ArrayList<String> fileDir = new ArrayList<String>();
	//파일명, 크기, 파일이 들어있는 폴더를 저장해두기위한 스태틱 리스트
	public static void main(String[] args) {
		File dir = new File("C:\\class\\파일 디렉토리 문제\\크기 정렬");
		find(dir);//모든 파일을 찾기
		//파일의 크기를 비교하여 크기가 작은 파일을 앞으로 당긴다
		//이때 저장해둔 이름, 크기, 파일이 들어있는 폴더 모두 함께 움직인다.
		for (int i = 0; i < fileName.size()-1; i++) {
			for (int j = 0; j< fileName.size()-1-i; j++) {
				if (fileSize.get(j) > fileSize.get(j+1)) {
					long sizeTemp = fileSize.get(j);
					fileSize.set(j, fileSize.get(j+1));
					fileSize.set(j+1, sizeTemp);
					String nameTemp = fileName.get(j);
					fileName.set(j, fileName.get(j+1));
					fileName.set(j+1, nameTemp);
					String dirTemp = fileDir.get(j);
					fileDir.set(j, fileDir.get(j+1));
					fileDir.set(j+1, dirTemp);
				}
			}
		}
		for (int i = fileName.size()-1; i >= 0; i--) {
			System.out.printf("%30s %,6dkb %5s\n",fileName.get(i),fileSize.get(i),fileDir.get(i));
		}
	}
	private static void find(File dir) {
		File[] list = dir.listFiles();
		for (File subfile : list) {
			if (subfile.isFile()) {
				fileName.add(subfile.getName());//파일 이름을 저장
				fileSize.add(subfile.length()/1024);//파일 크기를 저장
				String[] listDir = subfile.getAbsolutePath().split("\\\\");
				//파일이 들어있는 폴더를 찾기위해 파일주소를 //로 split하여 나눈후
				fileDir.add(listDir[listDir.length-2]);//마지막자리의 -1의 자리에 해당 폴더가 존재
			}
		}
		for (File subdir : list) {
			if (subdir.isDirectory()){
				find(subdir);
			}
		}
	}
}
