public class User implements Runnable {
	private static TumblerToy tumblerToy;
	private static final int USERPLAY = 4;
	private static final long USERWAIT = 1000;
	
	public User(TumblerToy tumblerToy) {
		this.tumblerToy = tumblerToy;
	}
	
	public void run() {
		try {
			for (int i = 0; i < USERPLAY; i++) {
				tumblerToy.on();
				System.out.println("Game on");
				Thread.sleep(USERWAIT);
			}
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
