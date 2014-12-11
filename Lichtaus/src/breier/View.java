package breier;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View extends JFrame{
	private JButton newGame;
	private JLabel moves;
	private JLabel text;
	private Container c_buttons;
	private Container c_label;
	
	// BorderLayout : 
	// 	GridLayout im CENTER
	// 	Container im SOUTH
	
	public View(){
		this.setLayout(new BorderLayout());
		this.setTitle("out little view... we love it <3");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		this.c_buttons.setLayout(new GridLayout(5,5));
		this.c_label.setLayout(new BorderLayout());
		
		this.add(c_buttons);
		this.add(c_label);
		
		this.setVisible(true);
	}

}