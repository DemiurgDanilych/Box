public class Toy implements Runnable {
	private static TumblerToy tumblerToy;
	private static final long TOYWAIT = 1000;
	
	public Toy(TumblerToy tumblerToy) {
		this.tumblerToy = tumblerToy;
	}
	
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			if(!tumblerToy.isOnOff()){
				continue;
			}
			tumblerToy.off();
			System.out.println("Game of");
			try{
				Thread.sleep(TOYWAIT);
			} catch (InterruptedException e){
				Thread.currentThread().interrupt();
			}
		}
	}
}
