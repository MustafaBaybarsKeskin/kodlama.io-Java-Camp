class Main{
	
	public static void main(String[] args){
		// Yapısı matematikteki matrislere benzemektedir.
		// [] -> satır [] -> sütun | Adeta bir tablo gibi.
		// Çok kullanılan yapılan değildir.
		// String[][][] sehirler = new String[3][3][3]; şeklinde boyut sayısıs arttırılabilir.
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Istanbul"; 	// 0. satırın 0. sütunu
		sehirler[0][1] = "Bursa"; 		// 0. satırın 1. sütunu
		sehirler[0][2] = "Edirne"; 		// 0. satırın 2. sütunu
		sehirler[1][0] = "Ankara"; 		// 1. satırın 0. sütunu
		sehirler[1][1] = "Konya"; 		// 1. satırın 1. sütunu
		sehirler[1][2] = "Kayseri"; 	// 1. satırın 2. sütunu
		sehirler[2][0] = "Diyarbakir"; 	// 2. satırın 0. sütunu
		sehirler[2][1] = "Sanliuurfa"; 	// 2. satırın 1. sütunu
		sehirler[2][2] = "Gaziantep"; 	// 2. satırın 2. sütunu
	
		// Nested loop: iç içe döngüler
		
		for(int i=0;i<2;i++){
			System.out.println("------------"); // Bölgeleri ayırmak için kullandık.
			for(int j=0;j<2;j++){
				System.out.println(sehirler[i][j]);
			}
		}
		
	}
}