package com.bilgeadam.main;

public class Ders_006_Switch_Case {
	public static void main(String[] args) {
		// if else
		int sayi = 9;
		
		if (sayi == 5) {
			System.out.println("say� 5");
		} else if (sayi == 3) {
			System.out.println("say� 5");
		} else if (sayi == 6) {
			System.out.println("say� 6");
			System.out.println("say�y� niye bulamad�n ?");
		} else {
			System.out.println("9 yoktur");
		}
		
		// ternary operat�r
		// String result = (sayi == 1) ? "say� 1" : "say� 1 de�ildir";// ternary yap�s�
		// System.out.println(result);
		
		// caDDe:
		switch (5) {
			case 5: {
				System.out.println("say� 5");
				
			}
			case 3: {
				
				System.out.println("say� 3");
			}
			case 2: {
				
				System.out.println("say� 2");
			}
			case 1: {
				
				System.out.println("say� 1");
			}
			default:
				System.out.println("Farkl� bir t�r say�s�s girdiniz");
				
		}
		
	}
	
}
