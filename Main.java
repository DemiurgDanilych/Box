public class Main {
	public static void main(String[] args) throws InterruptedException {
		TumblerToy tumblerToy = new TumblerToy();
		
		Thread userThread = new Thread(null, new User(tumblerToy), "User");
		Thread toyThread = new Thread(null, new Toy(tumblerToy), "Toy");
		
		userThread.start();
		toyThread.start();
		
		userThread.join();
		toyThread.interrupt();
	}
}