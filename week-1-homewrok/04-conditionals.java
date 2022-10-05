class Main {
	
	public static void main(String[] args) {
			
		// Programlar, insanların gündelik hayyatki aktivitelerin kodsal yani bilgisayar destekli sistemleri ile daha kolay hale getirilen versiyonlarıdır.
		// Hayatımızda kararlar veririz ve bu kararları da duruma göre gerçekleştiriyoruz.

		int sayi = 20;
		
		// Eğer buradaki şart bloğum geçerli ise şart bloğunu çalıştır.
		
		if(sayi < 20) { 
			System.out.println("Sayi 20'den kucuktur.");
		} 
		
		/* // Her ikisi de çalışacaktır.
		if(sayi < 15) {
			System.out.println("Sayi 15'ten kucuktur.");
		}
		*/
		
		// Else kavramı şart bloğunun dışında bir durum gerçekleirse ne yapayım olarak düşünebiliriz.
		// Herhangi bir hata yoksa değişkene atanmış sayıya göre bir çıktı alacağız.
		
		if(sayi < 20) {
			System.out.println("Sayi 20'den kucuktur.");
		} else {
			System.out.println("Sayi 20'den kucuk değildir.");
		}
		
		// Eşit mi sorgusunu çift eşittir ile yaparız bunun nedni tek eşittr ile atama yaparız.
		// Defensive programming: olabilecek tüm şartlara karşı program gerçekleştirme, bu örnekte bunu sağlamış olduk.
		// Ancak kullanıcıdan girdi alırken daha farklı önlemler almamız gerecek çünkü kulanıcı abc girdisi gönderirse kodumuz hata verecektir.
		
		if(sayi < 20) {
			System.out.println("Sayi 20'den kucuktur.");
		}else if(sayi == 20 {
			System.out.println("Sayi 20'ye eşittir");
		}else{
			System.out.println("Sayi 20'den buyuktur.");
		}
		
	}
}