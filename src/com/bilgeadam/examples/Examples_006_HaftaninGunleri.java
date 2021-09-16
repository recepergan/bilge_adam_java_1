package com.bilgeadam.examples;

import java.util.Scanner;

public class Examples_006_HaftaninGunleri {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Lütfen 1 -7 sayý olarak giriniz : ");
		int gun = klavye.nextInt();
		if (gun > 0) {
			
			switch (gun) {
				case (1):
					System.out.println("pazartesi");
					break;
				case (2):
					System.out.println("salý");
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
					System.out.println("lütfen belirtilen aralýkta sayý giriniz");
			}
		} else
			System.out.println("lütfen sýfýrdan büyük sayý giriniz");
		klavye.close();
	}
}
