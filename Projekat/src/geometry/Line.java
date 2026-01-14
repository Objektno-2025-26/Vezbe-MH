package geometry;

import java.awt.Graphics;

public class Line extends Shape {

	private Point startPoint;
	private Point endPoint;
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	public double length() {
		return startPoint.distance(endPoint);
	}
	
	@Override
	public boolean contains(int x, int y) {
		Point click = new Point(x,y);
		return (startPoint.distance(click) + endPoint.distance(click)) - length() <= 2;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(), 
				endPoint.getX(), endPoint.getY());		
	}
	
	@Override
	public void moveTo(int x, int y) {
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		startPoint.moveBy(byX, byY);
		endPoint.moveBy(byX, byY);
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%s) --> (%s,%s)", startPoint.getX(), startPoint.getY()
				, endPoint.getX(), endPoint.getY());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line temp = (Line)obj;
			if(startPoint.equals(temp.getStartPoint()) && 
					endPoint.equals(temp.getEndPoint()))
				return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Shape o) {
		if(o instanceof Line) {
			Line temp = (Line)o;
			return (int) (this.length() - temp.length());
		}
		return 0;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	

	

	
	
}
