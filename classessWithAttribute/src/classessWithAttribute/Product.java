package classessWithAttribute;

public class Product {
	
	public Product(int id, String name, double price, int stockAmount, String description) {
		System.out.println("Constructor Çalıştı");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	
	
	
	int id;
	String name;
	double price;
	int stockAmount;
	String description;
	String kod;

	public String getKod() {
		return this.name.substring(0,1) + id;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
