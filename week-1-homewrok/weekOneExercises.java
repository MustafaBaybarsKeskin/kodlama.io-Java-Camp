class Main {  

  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
	
	String ortaMetin = "Ilgilinzi çekebilir";
	String altMetin = "Vade süresi";
	
	//Değişken isimlendirmeleri Java'da camelCase yazılır.
	
	System.out.println("ortaMetin");
	System.out.println(ortaMetin);
	
	//integer
	int vade = 12;
	
	//double
	double dolarDun = 18.12;
	double dolarBugun = 18.24;
	
	//boolean
	boolean dolarDustuMu = false;
	
	String okYonu = "";
	
	if(dolarBugun < dolarDun){
		okYonu = "dwon.svg";
		System.out.println(okYonu);
		
	}
	else if(dolarBugun > dolarDun){
		okYonu = "up.svg";
		System.out.println(okYonu);
		
	} else {
		okYonu = "equal.svg";
		System.out.println(okYonu);
	}
	
	//array
	String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
	
	System.out.println(krediler[0];
	System.out.println(krediler[1];
	System.out.println(krediler[2];
	
	for (int i = 0; i < krediler.length; i++){
		System.out.println(krediler[i];
	}
	
  } 
  
}