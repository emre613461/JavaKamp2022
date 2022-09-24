package sayiBulma;

public class Main {

	public static void main(String[] args) {
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
			System.out.println("Sayi var.");
		}else {
			System.out.println("Sayi yok.");
		}
			
		

	}

}
