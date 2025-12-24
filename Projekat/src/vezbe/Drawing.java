package vezbe;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Drawing drawing = new Drawing();
		drawing.setBackground(Color.white);
		frame.setSize(1200,700);
		frame.setContentPane(drawing);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		Point p1 = new Point(200,200);
		g.setColor(Color.blue);
		p1.draw(g);
		
		Line l1 = new Line(p1, new Point(300,300));
		g.setColor(Color.green);
		l1.draw(g);
		
		Rectangle r1 = new Rectangle(p1, 200, 100);
		g.setColor(Color.magenta);
		r1.draw(g);
		
		
		Circle c1 = new Circle(new Point(500,500),50);
		Donut d1 = new Donut (new Point(600,600), 50, 30);
		g.setColor(Color.orange);
		c1.draw(g);
		d1.draw(g);
	}
}
