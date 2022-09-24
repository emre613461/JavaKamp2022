package polimorfizm;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] baseLogger=new BaseLogger [] {new FileLogger(), new DatabaseLogger (), new EmailLogger ()};
		
for (BaseLogger baseLogger2 : baseLogger) {
	baseLogger2.log("Loglandı");
	
}

CustomerManager customerManager=new CustomerManager(new FileLogger());
	customerManager.add();
	}

}
