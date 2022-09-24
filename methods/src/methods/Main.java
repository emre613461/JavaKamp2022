package methods;

public class Main {

	public static void main(String[] args) {
		aranacakSayi();

	}
	public static void aranacakSayi() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacakSayi = 7;
		boolean isPrime = false;
		for (int i : sayilar) {
			if (i == aranacakSayi) {
				
				isPrime=true;
				break;
			} 
			
		}

		if(isPrime) {
			mesajVer("Sayi Bulundu : " + aranacakSayi);
		}else {
			System.out.println("Sayi yok : " + aranacakSayi );
		}
			
		
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
