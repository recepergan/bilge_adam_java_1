package com.bilgeadam.main;

public class Ders_004_if_else {
	public static void main(String[] args) {
		// if else
		int sayi = 9;
		
		if (sayi == 1) {
			System.out.println("say� 1");
		} else {
			System.out.println("say� 1 de�ildir");
		}
		
		// ternary operat�r
		String result = (sayi == 1) ? "say� 1" : "say� 1 de�ildir";// ternary yap�s�
		System.out.println(result);
		
	}
	
}
