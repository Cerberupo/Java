package CirculoMove;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{
	
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	
	private void movimiento(){
		if (x + xa < 0) {
			xa = 1;
		}
		
		if (x + xa > getWidth() - 30) {
			xa = -1;
		}

		if (y + ya < 0) {
			ya = 1;
		}

		if (y + ya > getHeight() - 30) {
			ya = -1;
		}
		
		
		
		x = x + xa;
		y = y + ya ;
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.BLUE);
		g2d.fillOval(x, y, 30, 30);
	}

	public static void main(String[] args) throws InterruptedException {
		Main game = new Main();
		JFrame frame = new JFrame();
		frame.add(game);
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			game.movimiento();
			game.repaint();
			Thread.sleep(10);
		}
	}
	

	

}
