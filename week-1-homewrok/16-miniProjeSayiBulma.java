public class Main {
	
	public static void main(String[] args) {
		// Sayı bulma, diziler ile yapacağız.
		// Bir dizi oluşturacağız ve bu dizinin içerisinde arama yapacağız. Aranan öğe dizide var veya yok diye çıktı üretmesi istenmektedir.
		
		int[] numbers = new int[]{1, 2, 3, 5, 7, 8, 9, 0};
		int search = 5;
		boolean isIn = false;
		
		for(int number:numbers) {
			if(number == numbers) {
				isIn = true;
				break;
			} 
		}
		
		if(isIn) {
			System.out.println("Aranan sayi bulundu: " + number);
		} else {
			System.out.println("Aranan sayi bulunamadi: " + number);
		}
		
	}
}