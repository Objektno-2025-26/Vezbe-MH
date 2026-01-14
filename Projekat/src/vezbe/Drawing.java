package vezbe;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Drawing drawing = new Drawing();
		drawing.setBackground(Color.white);
		frame.setSize(1200, 700);
		frame.setContentPane(drawing);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void paint(Graphics g) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		Point p1 = new Point(200, 200);

		Line l1 = new Line(p1, new Point(300, 300));

		Rectangle r1 = new Rectangle(p1, 200, 100);

		Circle c1 = new Circle(new Point(500, 500), 50);
		Donut d1 = new Donut(new Point(600, 600), 50, 30);

		shapes.add(p1);
		shapes.add(l1);
		shapes.add(r1);
		shapes.add(c1);
		shapes.add(d1);

		for (Shape s : shapes) {
//			Inicijalno iscrtavanje
			g.setColor(Color.BLUE);
			s.draw(g);
//			Pomeranje za 30 piksela
			s.moveBy(30, 30);
//			Sekundarno iscrtavanje
			g.setColor(Color.RED);
			s.draw(g);
			
//			Ista pocetna tacka
			g.setColor(Color.GREEN);
			s.moveTo(150, 150);
			s.draw(g);
		}
		
		Rectangle r2 = new Rectangle(new Point(600,300),50,50);
		
		int innerRadius = (int)(r2.getWidth()*Math.sqrt(2) / 2);
		Point center = new Point(r2.getUpperLeft().getX() + r2.getWidth()/2, 
				r2.getUpperLeft().getY() + r2.getHeight()/2);
		Donut d2 = new Donut(center, innerRadius, 80);
		
		g.setColor(Color.BLACK);
		r2.draw(g);
		d2.draw(g);

	}
}
