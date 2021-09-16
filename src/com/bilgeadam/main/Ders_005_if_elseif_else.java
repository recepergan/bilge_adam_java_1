package com.bilgeadam.main;

public class Ders_005_if_elseif_else {
	public static void main(String[] args) {
		// if else
		int sayi = 9;
		
		if (sayi == 5) {
			System.out.println("sayý 5");
		} else if (sayi == 3) {
			System.out.println("sayý 3");
		} else if (sayi == 6) {
			System.out.println("sayý 6");
			System.out.println("sayýyý niye bulamadýn ?");
		} else {
			System.out.println("9 yoktur");
		}
		
		// ternary operatör
		// String result = (sayi == 1) ? "sayý 1" : "sayý 1 deðildir";// ternary yapýsý
		// System.out.println(result);
		
	}
	
}
