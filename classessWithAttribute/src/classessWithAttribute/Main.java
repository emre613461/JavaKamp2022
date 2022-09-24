package classessWithAttribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Asus laptop", 3000, 3, " laptopp");
		product.setId(1);
		product.setName("asus laptop");
		product.setPrice(5000);
    	product.setDescription("laptop");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());

	}

}
