class Main {
	
	public static void main(Sting[] args) {
		
		// Java tip güvenli bir dildir yani değişkeni tanımlarken değşişkenin tipini bilmek ister.
		
		int sayi = 12;
		// sayi = "Ankara"; Hata alırız çünkü bu değişken daha önceden int olarak tanımlandı.
		// Primitive Types = İlkel Tip, bir dilin temel tipleridir.
		
		byte sayi = 12;
		// sayi = 128 Hata verir, int kabul etmesinin nedeni default (varsayılan) olarak aldığı veri tipi vardır bu yüzden int gösterir.
		
		// Ondalıklı sayıları tutmak için double veya float ifadelerini kullanırız.
		double sayi = 12.5;
		
		// Char, tek karakter tutran ve 2 byte'lık bir alan kaplayan bir veri tipidir.
		char karakter = 'a'; // char karakter = "a"; hata alırız, bunu String olarak algıladı ve tanımlamamızı engelledi.
		
		// Boolean, 1 byte'lık veri tutuar. Doğru veya yanlışdır yani 1 veya 0'dır.
		// ascii: her karakterin bir sayısal karşılığı vardır, bunu bir alfabe gibi düşünebiliriz.
		
		boolean dogruMu = false;
		
		if(dogruMu == true) {} // Eğer işlem doğru ise bu kod bloğunun içerisindekini çalıştır anlamına gelir.
		
	}
}