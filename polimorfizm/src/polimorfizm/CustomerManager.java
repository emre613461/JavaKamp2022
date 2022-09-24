package polimorfizm;

public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager (BaseLogger log){
		this.logger=log;
	}
	
	public void add() {
		logger.log("Customer Musteri loglandi.");
		System.out.println("Musteri Eklendi");
	}

}
