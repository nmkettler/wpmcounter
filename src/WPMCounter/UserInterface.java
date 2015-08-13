package WPMCounter;

import java.awt.Container;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
public class UserInterface implements Runnable{
	private JFrame frame;
	
	@Override
	public void run() {
		frame = new JFrame("WPM Counter");
		frame.setPreferredSize(new Dimension(600,400));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);	
		
	}

	private void createComponents(Container container) {
		frame.setLayout(new GridLayout(3,2));
		JTextField sentence = new JTextField("Type this sentence as fast as you can and see how fast you can do it!");
		container.add(sentence);
		sentence.setEditable(false);
		JTextField inputField = new JTextField("");
        container.add(inputField);
        
        JButton done = new JButton("Done!");
        JButton start = new JButton("Start!");
        
        EventListener handler = new EventListener(done, start, sentence, inputField);
        
        done.addActionListener(handler);
        start.addActionListener(handler);
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(start);
        panel.add(done);
        container.add(panel);
	}
	
	public JFrame frame(){
		return frame;
	}

}
