package intro;

public class Main {

	public static void main(String[] args) {
		//String internetSubeButonu = "İnternet Şubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;	
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar Düştü Resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar Yükseldi Resmi");
		}else {
			System.out.println("Dolar Eşittir Resmi");
		}
		String[] krediler = {
				"hızlı kredi",
				"mutlu emekli kredisi",
				"konut kredisi",
				"çiftçi kredisi",
				"msb kredisi",
				"meb kredisi"
				}; 
		//dizi elemanlarını tek tek dolaş demek: forEach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for (int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
 
	} 

}
 