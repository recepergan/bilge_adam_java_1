package com.bilgeadam.examples;

import java.util.Scanner;

public class Examples_006_HaftaninGunleri {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("L�tfen 1 -7 say� olarak giriniz : ");
		int gun = klavye.nextInt();
		if (gun > 0) {
			
			switch (gun) {
				case (1):
					System.out.println("pazartesi");
					break;
				case (2):
					System.out.println("sal�");
					break;
				case (3):
					System.out.println("carsamba");
					break;
				case (4):
					System.out.println("persembe");
					break;
				case (5):
					System.out.println("cuma");
					break;
				case (6):
					System.out.println("cumartesi");
					break;
				case (7):
					System.out.println("pazar");
					break;
				default:
					System.out.println("l�tfen belirtilen aral�kta say� giriniz");
			}
		} else
			System.out.println("l�tfen s�f�rdan b�y�k say� giriniz");
		klavye.close();
	}
}
