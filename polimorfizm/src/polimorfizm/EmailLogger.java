package polimorfizm;

public class EmailLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to EMail  :" + message);
	}

}
