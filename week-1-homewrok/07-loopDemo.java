class Main{
	
	public static void main(String[] args){	
		// Döngü: bir programda bir birine benzeyen işlemleri tekrarlamaya yarar.
		// Örnek: 1'den 100'e kadar olan sayıları alt alta yazdırmak.
		// Örnek: Bir listdene verileri çekiyorsunuz ve ekrana basmak istiyorsunuz böyle bir durumda da döngüleri kullanırız.
		
		// For
		// i++ : i'yi bir arttır. i++ = i=i+1
		// int i = 1 sayaç tanımıdır, yani sayacımız birden başlıyor.
		// i < 10 i 10'dan küçük olduğu sürece anlamına gelir.
		// i++ saycın kaçar kaçar artacağını belirlediğimiz kısımdır.
		// i 10'a gelene kadar aynı işlem srekli tekrar eder
		
		for(int i=1;i<10;i++){	
			System.outprintln(i);
		}
		
		System.out.println("For dongusu bitti."); // Döngü bittiğinde bu satur ekrana basılacaktır.
		
		// i+=2 i'yi ikişer ikişer artır bu halde çıktı: 1, 3, 5, 7, 9 olacaktır
		
		/*--------------------------------*/
		
		
		// While 
		// Bir değişken direkt olarak sadece tanımlandığı yerde (default hali ile tanımlandı ise) blokta geçerlidir, diğer yerlerde kullanılamaz.
		
		int i = 1;
		
		while(i<10){
			System.out.println(i);
			i++;
		}
		
		// infinite loop: sonsuz döngü, sonsuz kere çalışır çünkü i 1'den başladı ve 10'dan küçük olana kadar bu durum devam edecektir. Sayacın artışını döngünün içinde belirterek bu durumu çözebiliriz.
		System.out.println("While dongusu bitti");
		
		// Do-While çok daaha seyrek kullanılır.
		
		int j = 1;
		
		do{
			System.out.println(i);
			j+=2;
		}while(j<10);
		
		System.out.println("Do-While dongusu bitti");		
		
		// While döngüsünden farkı, şart sağlanmasa bile çalışır.
		// Örenğin j'nin değeri 100 olsun bu bağlamda, ilk olarak ekrana 100 çıktısı verilecek ardından 2 arttırılacak ve en son 102 10'dan küçük mü kontrolü yapılacak bu durum sağlanmadığı takdirde döngüden çıkış yapılacaktır.
		// 1, 3, 5, 7, 9 çıktısını alırız.
		
		do{
			System.out.println("Loglandı");
			System.out.println(i);
			j+=2;
		}while(j<10);
		
		// veri tabanına döngünün test edildiğine dair kayıt girilmesi istendiğinde kullanılailir.
	}
}