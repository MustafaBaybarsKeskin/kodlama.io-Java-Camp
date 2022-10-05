public class Main {
	
	public static void main(String[] args) {
		// Kalın sesli ve ince sesli harfler.
		char harf = 'a';
		
		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalin sesli harfler");
				break;
			default:
				System.out.println("Ince sesli harfler");
		}
			
	}
}