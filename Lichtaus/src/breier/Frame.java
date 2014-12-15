package breier;
import java.awt.*;

import javax.swing.*;

public class Frame extends JFrame {
	private JButton newgame;
	private JButton[][] buttons;
	private Container button;
	
	public Frame() {
		buttons = new JButton[5][5];
		newgame = new JButton("New Game");
		button = new Container();
		
		this.setLayout(new BorderLayout());
		this.setTitle("Licht Aus");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);
        this.add(this.button, BorderLayout.CENTER);
        this.button.setLayout(new GridLayout(5,5));
        
        this.add(this.newgame, BorderLayout.SOUTH);
        
        //verschatelte for schleife für die Erstellung der Buttons, Mehrdimensionales Array
        for(int i=0; i < 5; i++){
        	for(int j=0; j < 5; j++){
        		this.buttons[i][j] = new JButton();
        		this.button.add(this.buttons[i][j]); //Buttons werden dem Container hinzugefügt
        	}
        }
        
        
        
        this.setVisible(true);
	}
	public static void main(String [] args){
		new Frame();
	}
}
