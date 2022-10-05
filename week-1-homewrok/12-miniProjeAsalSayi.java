public class Main {
	
	public static void main(String[] args) {
		// Asal sayı kontrol programı.
		int number = 25;
		int remainder = number % 2; // Mod operatörü
		
		System.out.prinln(remainder);
		boolean isPrime = false;
		
		if(number==1){
			System.out.println("Sayi asal degildir.");
			return; // Bağlı bulunulan bloğu veya metodu bitirir.
		}
		
		if(number<1){
			System.out.println("Gecersiz sayi.");
		}
		
		for(int i=2;i<number;i++){
			if(number % i == 0){
				isPrime = true;
			}
		}
		
		if(isPrime){
			System.out.println("Sayi asaldir.");
		}else{
			System.out.println("Sayi asal degildir.");
		}
		
	}
}