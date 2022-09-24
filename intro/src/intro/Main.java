package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Merhaba");
		String metin = "İİlginizi çrkrbilir";
		System.out.println(metin);
		
		double dolarDun=18.90;
		double dolarBugun=18.90;
		String okYonu="";
		if (dolarDun<dolarBugun) {
		 okYonu="up.svg";
			System.out.println(okYonu);
		}else if (dolarBugun<dolarDun) {
			okYonu="Down.svg";
			System.out.println(okYonu);
		}else {
			okYonu="equate.svg";
			System.out.println(okYonu);
		}
		
//		System.out.println(dolarDun);
	}

}
