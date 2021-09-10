public class TumblerToy {
	volatile private boolean onOff = false;
	
	public boolean isOnOff() {
		return onOff;
	}
	
	void on(){
		onOff = true;
	}
	
	void off(){
		onOff = false;
	}
}
