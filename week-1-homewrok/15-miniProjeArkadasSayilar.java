public class Main {

	public static void main(String[] args) {
		// 220-284 Arkadaş sayılar: kendileri hariç pozitif tam bölenleri toplamı birbirine eşit olan sayılar arkadaş sayılardır.
		
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		for(int i=1;i<number1;i++) {
			if(number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		
		for(int i=1;i<number2;i++) {
			if(number2 % i == 0) {
				total2 = total2 + i;
			}
		}
		
		// && Mantıksal ve opertaörüdür.   [0 && 0 -> 0] - [0 && 1 -> 0] - [1 && 0 -> 0] - [1 && 1 -> 1]
		// || Mantıksal veya operatörüdür. [0 || 0 -> 0] - [0 || 1 -> 1] - [1 || 0 -> 1] - [1 || 1 -> 1]
		
		if(number1 == total2 && number2 == total1) {
			System.out.println(number1 + " ve " + number2 + " arkadas sayilardir.");
		} else {
			System.out.println(number1 + " ve " + number2 + " arkadas sayi degildirler.");
		}
		
	}
}