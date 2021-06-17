package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	//메소드 일반
	public static void main(String[] args) {
		
		//List<Point> pList = new ArrayList<Point>();
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1,1);
		Point p02 = new Point(2,2);
		Point p03 = new Point(3,3);
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("유재석", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		
		System.out.println(pMap.get("정우성").getX());
		
		
		Point p04 =new Point(100, 1000);
		pMap.put("유재석", p04);
		System.out.println(pMap.toString());
		
		//키 리스트를 만든다
		//["정우성", "이효리", "유재석"]  --> Map 이  key들을 Set으로 관리하고 있다
		//pMap.get(이름)
		
		Set<String> kyes = pMap.keySet();
		
		for(String key : kyes) {
			//System.out.println(pMap.get(key).getY());
			System.out.println(pMap.get(key).toString());
		}
		
		
	}

}
