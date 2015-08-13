package WPMCounter;

import java.util.Timer;

public class StopWatch {
	private boolean running;
	private Counter counter;
	private Timer timer;
	
	public StopWatch(){
		timer = new Timer(true);
	}
	
	public boolean isRunning(){
		return running;
	}
	
	public void startRunning(){
		running = true;
		counter = new Counter();
		timer.scheduleAtFixedRate(counter, 0, 3000);
	}
	public void doIt(){
		running = false;
		System.out.println(counter.getCount() + "times");
		counter.cancel();
	}
}
