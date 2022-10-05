class Main {
	
	public static void main(Sting[] args) {
		// Java case sensitive yani büyük küçük harf duyarlı bir dildir.
		// system.out.println("Error"); şeklinde bir kullanımda hata alırız.
		
		// Değişken tanımlarken: tipi daha sonra değişkenin adı ve en son değeri tanımlanır.
		// Örnek : degisken_tipi değişkenAdi = tipeGoreDeger;
		
		// sürekli oaln veriyi elle yazdıramayız çünkü herhangi bir güncelleme gerekirse önceden yazılmış her kod parçası tek tek değiştirilmek zorundadır. İşte böyle bir durumla karşılaşmamak için biz değişkenleri kulanırız.
		
		// int = integer | Java da tam sayı tanımlamak için kullamılır.
		// Değişken tanımlarken camelCasing kullanılır
		
		int sayi = 10;		
		int ogrenciSayisi = 32;
				
		// Öğrenci sayısı yukarıda tanımlanmış olan değişkenden alınır ve allta metin ifademize eklenir.
		System.out.println("Ogrenci sayisi : " + ogrenciSayisi);
		
		// Bazı durumlarda tip dönüşümü yapmamız gerekcek. Örnek: int -> String
		
		// reusability: tekrar tekrar kullanılabilirlik. Bir şeyi yaz tekrar kullan, her seferinde tekrar yazma.
		// code refactoring: kodları temizleme
		
		// String metinsel ifadeleri tanımlarken kullanırız.
		String mesaj = "Ogrenci Sayisi";
		// Artık her seferinde öğrenci sayısı yazmamak için, bu metinsel ifadeyi de bir deişkene atadık.
		System.out.println(mesaj + ogrenciSayisi);
		
		// Her bir satır bellekte yer kaplar. Değişken kullanarak bellek kullanımı da en aza indirgeyebiliriz.
		System.out.println("Ogrenci sayisi : 9"); 
		System.out.println("Ogrenci sayisi : 9");
	}
}