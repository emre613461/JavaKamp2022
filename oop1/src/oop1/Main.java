package oop1;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Delonghi Kahve Makinesi");
		product.setDiscount(7);
		product.setUnitPrice(7500);
		product.setUnitInStock(10);
		product.setImageUrl("bg1.jpg");
		
		//System.out.println("Isim :" + product.name);
		Product product1 = new Product();
		product1.setName("Kitchen Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(10);
		product1.setImageUrl("bg1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smag Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(10);
		product2.setImageUrl("bg1.jpg");
		
		Product[] products = {product,product1,product2};
		for (Product product3 : products) {
			System.out.println(product3.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("054684455");
		individualCustomer.setCustomerNumber("5");
		individualCustomer.setFirstName("Emre");
		individualCustomer.setLastName("Koç");
		
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Koç");
		corporateCustomer.setPhone("054566");
		corporateCustomer.setTaxNumber("1255222");
		corporateCustomer.setCustomerNumber("554456");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
	}

}
