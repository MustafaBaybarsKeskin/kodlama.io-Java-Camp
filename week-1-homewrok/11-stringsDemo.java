public class Main {
	
	public static void main(String[] args) {
		// Stringler aslında bir karakter dizisidr.
		
		String mesaj = "Bugun hava cok guzel";		
		System.out.println(mesaj);
		
		System.out.println("Eleman sayisi: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yasasin!"); // Birleştirme işlemidir, mesaj olarak tanımladığımız ifade ile buradaki ifade bir araya getirilecekttir.
		// Ancak bu yeni bir string oluşturur, yani siz mesajınızı tekrar çağırdığınızda az önceki işlemin geçeli olmadığını görürsünüz.
		// Eğer bu değişikliğin uygulanmasını istiyorsanız birleştirme fonksiyonunu bir değişkene atamanız gerekmektedir.
		System.out.println(mesaj.starsWith("B")); // mesaj değişkeni B ile başlıyorsa true döndürür. Çünkü mesajın ilk karakteri B'dir. Eğer parantez () içine b (küçük b) yazsaydık false döndürürdü çünkü Java case sensitive bir dildir yani büyük küçük karaktere duyarlıdır.
		System.out.println(mesaj.endsWith(".")); // mesaj değişkeni nokta (.) ile bitiyorsa true döndürür. Çünkü mesajın son karakteri noktadır (.).
		char[] karakterler = new char[25];
		mesaj.gerChars(0, 4, karakterler, 0); // mesaj değişkenin 0. index'inden 5. index'ine (5. index dahil değil) olan kısmını karakterler dizisinin 0. indexinden itibaren ata.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); // a karakterinin ilk hangi indexte olduğunu belirtir.
		System.out.println(mesaj.lastIndexOf('a')); // a karakterini sondan aramaya başlar yine ilk hangi indexte karşılaşılırsa index numarası bize döndürülür.
		
		/* ------------------------------------ */
		
		System.out.println(mesaj.replace(' ', '-' )); // Bu fonksiyon ile boşlukları kısa çizgi (-) ile değiştirmiş olduk. Replace in kelime anlamıda yer değiştirmektir.
		// Bize yeni bir metin çıktısı üretir, eğer biz bu çıktıyı kullanmak istiyorsak mutlaka bir değişkene atamak zorundayız.
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2)); // String i 2. indexten itibaren kes veya parçala anlamına gelir..
		System.out.println(mesaj.substring(2, 4)); // 2. indexten 4. indexe kadr olan kısmı ayırır acnak 4. index dahil değildir.
		// split fonksiyonu bir metni belli bir karakter veya karakter dizini dikkate alarak parçalamaya yarar.
		// Her boşlukta ayırma işlemi yapacak.
		for (String kelime : mesaj.split(" ")){ 
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // Tüm karakterleri küçük karaktere çevirecektir.
		System.out.println(mesaj.toUpperCase()); // Tüm karakterleri büyük karaktere çevirir.
		// Her ikiside veritabanından yapılan aramalarda kullanılmaktadır.
		
		System.out.println(mesaj.trim()); // String imizdeki boşlukları baştan ve sondan olmak üzere yok eder.

	}
}