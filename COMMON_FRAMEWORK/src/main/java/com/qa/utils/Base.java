package com.qa.utils;

public class Base {
	private static final String String = null;

	public static void base(){
		String a="1";
		String b="1";
		if(a==b){
			System.out.println("equal 1");
			String n= new String ("2");
			String M= new String("2");
			if(n==M){
				System.out.println("equal 2");
			}
		}
	}
	public static void main(String[]args) {
		base();
	}
	

}

