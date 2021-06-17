package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		
		while(lottoSet.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			
			lottoSet.add(num); //중복체크 
			System.out.println(lottoSet.size() + "  " + num);
		}
		
		System.out.println("---------------------------");
		
		for(int lottoNo : lottoSet) {
			System.out.print(lottoNo + "    ");
		}

	}

}
