package geometry;

import java.awt.Graphics;

public class Point extends Shape {

	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
	}
	
	@Override
	public boolean contains(int x, int y) {
		return distance(new Point(x,y)) <= 2;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(x-3,y,x+3,y);
		g.drawLine(x, y-3, x, y+3);
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		x += byX;
		y += byY;
		
	}
	
	public double distance(Point p) {
		int dx = x - p.x;
		int dy = y - p.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%s)", x,y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point temp = (Point)obj;
			if(x == temp.getX() && y == temp.getY())
				return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Shape o) {
		if(o instanceof Point) {
		  Point temp = (Point) o;
		  Point coordinateStart = new Point(0,0);
		  return (int)(this.distance(coordinateStart) - temp.distance(coordinateStart));
		}
		return 0;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	



	
	
}
