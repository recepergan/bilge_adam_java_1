package bilgeadam_Method;

public class Method__0001_KezDongu {
	// voidli parametresiz
	public static void voidliParametresiz() {
		System.out.println("Ben voidli parametresiz metodum");
		// git nmvndsv
		// jobfngjk
	}
	
	// voidliparametreli
	public static void voidliParametreli(String adiSoyadi) {
		System.out.println(adiSoyadi);
	}
	
	// overloading : parametre say�lar� farkl� olan metotlara denir.
	public static void voidliParametreli(String adiSoyadi, String diller) {
		System.out.println(adiSoyadi);
	}
	
	// voidsiz parametresiz
	public static String voidsizParametresiz() {
		return "K�TAHYA";
	}
	
	// voidsiz parametreli
	// int = d�� d�nyaya bir �eyler g�ndermek i�in
	// (int sayi1, int sayi2) = d�� d�nyadan bir�eyler almak
	// return geriye d�nderir.
	public static int voidsizParametreli(int sayi1, int sayi2) { // sayi1 ve sayi2 parametredir.
		
		return sayi1 + sayi2;
	}
	// overloading
	
	public static void main(String[] args) {
		voidliParametresiz();
		voidliParametreli("Recep ERGAN");
		String adi = voidsizParametresiz();
		System.out.println(adi);
		int toplam = voidsizParametreli(4, 6); // 4 ve 6 arg�mand�r.
		System.out.println(toplam);
	}
}
