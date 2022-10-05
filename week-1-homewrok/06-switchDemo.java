class Main{

	public static void main(String[] args){
		// if bloklarına nazaran daha az kullanılırlar. 
		// Switch blokları ile dallandırma yapılır.
		
		char grade = 'A';
		
		// swtich bloğunda şartımızın öznesini belirtiyoruz.
		
		switch(grade){
			case 'A':
				System.out.println("Mukemmel : gectiniz");
				break;
			case 'B':
				System.out.println("Cok guzel : gectiniz");
				break;
			case 'C':
				System.out.println("Iyi : gectiniz");
				break;
			case 'D':
				System.out.println("Fena degil : gectiniz");
				break;
			case 'F':
				System.out.println("Malesef Kaldiniz");
				break;
			default: // A,B,C,D,F dışında bir harf notu girilirse varsayılan bir cevap verilir
				System.out.println("Gecersiz not");
		}
		
		// [IntelliJ IDEA da geçerlidir IDE'ye göre farklılık gösterebilir.] Ctrl + shift + alt + L tuş kombinasyonu sayesinde kodunuzu otomatik düzenleyebilirsiniz.
		/*
		case 'B':
		case 'C':
				System.out.println("Iyi : gectiniz");
				break;
		
		// eğer bu şekilde bir kullanım gerçekleştirisek her iki şartta da aynı çıktıyı alırız.
		
		*/
	}
}