	package WPMCounter;
	
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
	import javax.swing.*;
	
	public class EventListener implements ActionListener{
		private JButton done;
		private JButton start;
		private JTextField sentence;
		private JTextField inputField;
		private Counter counter;
		private StopWatch stopwatch;
		private javax.swing.JTextField jTextField;
		
		public EventListener(JButton done, JButton start, JTextField sentence, JTextField inputField){
			this.done = done;
			this.sentence = sentence;
			this.inputField = inputField;
			this.counter = new Counter();
			this.stopwatch = new StopWatch();
			this.start = start;
		}
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			int value = 0;
			String text = inputField.getText();
			try{
				value = Integer.parseInt(inputField.getText());
			}catch(Exception e){
				
			}
			if(ae.getSource() == start){
				stopwatch.startRunning();
				try{
					System.out.println("running");
					Thread.sleep(20000);
				}
				catch(InterruptedException e){
				}
				
			}
			if(ae.getSource() == done){			
				int amountOfWords = counter.result(text);
				inputField.setText("");
				sentence.setText("" + amountOfWords);
				stopwatch.doIt();	//causes eventDispatcherror
			}
		}
		
	
	}
