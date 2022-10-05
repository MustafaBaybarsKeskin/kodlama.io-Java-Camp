class Main{
	
	public static void main(String[] args){
		String ogrenci1 = "Engin";
		String ogrenci2 = "Demir";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		// Diziler genelde aynı tipte öğeleri tutmamızı sağlayan yapılardır
		// Yukarıdaki kodu şu şekilde yazabilirdik:
		// Dizi tanımlama: dizi_tipi [] dizi_adi = new dizi_tipi[dizinin_eleman_sayisi];
		
		String[] ogrenciler = new String[3]; 
		ogrenciler[0] = "Ali"; // dizinin ilk elemanı, eleman index olarak tanımlanır 0. index aslında 1. elemandır.
		ogrenciler[1] = "Veli";
		ogrenciler[2] = "Melih";
		ogrenciler[3] = "Serhat";
		//ogrenciler[4] = "Mert"; // ArrayIndexOfBoundsException hatası alırız bunun nedeni ilk başta diziyi tanımlarken index sayısını 3 olarak belirtmiştik ancak bu satır ile diziyi aşmış oluyoruz.
		
		
		System.out.println("-----------------");
		
		// Dizi içerisindeki elemanları yaazdırmak için for döngüsü kullandurk.
		// i=0 olmasının nedeni dizide 0. indexten taramaya başlamak istememizdir.
		// ogrenciler.length ifadesi ise dizinin boyutunu ifade eder böylelikle dizinin boyutunda bir değişikliğe gidildiğinde döngü içerisinde bir değişiklik yapılmasına gerek kalmaz.
		
		for(int i=0;i<ogrenciler.length;i++){
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----------------");
		
		for(String ogrenci:ogrenciler){ // ogrenci takma addır istediğiniz yazabilrsiniz ama kısaltma yapmamakta yarar vardır.
			Sytem.out.println(ogrenci);
		}
		
	}
}