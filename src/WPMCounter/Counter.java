package WPMCounter;

import java.util.TimerTask;

public class Counter extends TimerTask{
	int counter;
	
	public Counter(){
		counter = 0;
	}
	public int result(String count){

		return count.length();
	}

	@Override
	public void run() {
		counter++;
		System.out.println(counter);
		
	}
	public int getCount(){
		return counter;
	}
}
