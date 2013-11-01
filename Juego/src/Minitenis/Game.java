package Minitenis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mini tenis");
		frame.add(new Game());
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	@Override
	public void paint (Graphics b){
		Graphics2D b2d = (Graphics2D) b;
		b2d.setColor(Color.BLUE);
		b2d.fillOval(0, 0, 50, 50);
		b2d.drawOval(0, 0, 70, 100);
	}

}
