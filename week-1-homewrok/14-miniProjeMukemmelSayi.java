public class Main {
	
	public static void main(String[] args) {
		// Mukemmel sayi: kendinden başka pozitif tüm tam bölenlerin toplamı sayisi kendisine eşit olan sayidir.
		// Örnek: 6 --> 1, 2, 3 --> 1 + 2 + 3 = 6 
		
		int number = 6;
		int total = 0;
		
		for(int i=1;i<nmber;i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		if(total == number) {
			System.out.println(number + " mukemmel bir sayidir.");
		} else if (number <= 1) {
			System.out.println("Gecersiz sayi: " + number); 
		} else {
			System.out.println(number + " mukemmel bir sayi degildir.");
		}
	}
}