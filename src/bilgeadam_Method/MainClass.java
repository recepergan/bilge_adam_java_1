package bilgeadam_Method;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// nfnfg
		// ndfnfd
		// fdfs
		Method__0003_Hesap_Makinesi method = new Method__0003_Hesap_Makinesi();
		
		// method.hesapMakinasi(5, 6);
		// method.usluSayi();
		// method.karekokSayi();
		// method.buyuk();
		
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("kelimeyi giriniz");
		// String a = scanner.nextLine();
		//
		// Method__0003_Hesap_Makinesi.findA(a);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("a giriniz");
		int a = scanner.nextInt();
		
		System.out.println("b giriniz");
		int b = scanner.nextInt();
		
		System.out.println("c giriniz");
		int c = scanner.nextInt();
		
		System.out.println("x giriniz");
		int x = scanner.nextInt();
		
		Method__0003_Hesap_Makinesi.fonksiyonHesapla(a, b, c, x);
		
	}
}
