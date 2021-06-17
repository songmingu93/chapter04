package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	//필드
	private Circle[] cArray;
	private int crtPos;
	
	//생성자
	public CircleList() {
		this.cArray = new Circle[3]; 
		crtPos = 0;
	}
	
	//메소드 gs
	
	//메소드 일반
	public void add(Circle circle) {
		//배열의 크기가변 로직 생략
		cArray[crtPos] = circle;
		crtPos = crtPos + 1;  //crtPos++
	}

	public int size() {
		return crtPos;
	}
	
	public Circle get(int index){
	    return cArray[index];
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
