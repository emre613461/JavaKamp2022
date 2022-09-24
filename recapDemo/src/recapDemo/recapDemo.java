package recapDemo;

public class recapDemo {

	public static void main(String[] args) {
		int sayi1=70;
		int sayi2 =60;
		int sayi3=50;
		
		if (sayi1>sayi2 & sayi1>sayi3) {
			System.out.println("Sayi1 buyuktur");
		}else if(sayi2>sayi1 & sayi2>sayi3) {
			System.out.println("sayi2 buyuktur");
		}else if(sayi3>sayi1 & sayi3>sayi2){
			System.out.println("sayi 3 buyuktur");
		}else if(sayi1==sayi2 & sayi1==sayi3){
			System.out.println("sayilar esittir");
			
		}

	}

}
