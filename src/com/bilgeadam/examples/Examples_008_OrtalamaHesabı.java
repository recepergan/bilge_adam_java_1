package com.bilgeadam.examples;

import java.util.Scanner;

public class Examples_008_OrtalamaHesab� {
	// Kullan�c� manuel olarak 5 say� girsin bu say�lar�n ort. bulsun
	public static void main(String[] args) {
		/*
		 * int sayi1 = 1, sayi2 = 2, sayi3 = 3, sayi4 = 4, sayi5 = 5, toplam = 0;
		 * toplam = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;
		 * System.out.println("ortalama : " + toplam);
		 */
		
		Scanner klavye = new Scanner(System.in);
		int sayi, toplam = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + ". say�y� giriniz:");
			sayi = klavye.nextInt();
			toplam = toplam + sayi;
			;
		}
		toplam = (toplam) / 5;
		System.out.println("ortalama : " + toplam);
		
	}
	
}
