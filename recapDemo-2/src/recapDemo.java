
public class recapDemo {

	public static void main(String[] args) {
		double[] myList = {1.6, 2.7, 5.8, 3.6};
		double total = 0;
		double max = myList[0];
		
		for(double number:myList) {
			if(max<number) {
				max=  number;
			}
			total = total + number;
			System.out.println(number);
			
		}
		System.out.println("En buyuk = " + max);
		System.out.println("Toplam = " + total);;
	}

}
