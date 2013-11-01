package Minitenis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Camion extends JPanel{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Camión");
		frame.add(new Camion());
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics b){
			
			Graphics2D graficos = (Graphics2D) b;
			graficos.setColor(Color.GRAY);
			graficos.fillOval(180, 230, 40, 40);
			graficos.fillOval(280, 230, 40, 40);
			graficos.setColor(Color.GREEN);
			graficos.fillRect(150, 180, 200, 70);
			graficos.setColor(Color.RED);
			graficos.fillRect(320, 150, 70, 100);
			graficos.setColor(Color.BLUE);
			graficos.fillRect(350, 160, 30, 20);
		
		
	}

}
