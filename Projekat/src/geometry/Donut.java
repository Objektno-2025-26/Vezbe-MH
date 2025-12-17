package geometry;

public class Donut extends Circle{
  
	private int innerRadius;
	
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center,radius,innerRadius);
		this.selected = selected;
//		super(center,radius,selected);
//		this.innerRadius = innerRadius;
	}
	
	@Override
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}
	
	@Override
	public String toString() {
		return String.format("Center: (%s,%s), radius = %s, innerRadius = %s", 
				center.getX(), center.getY(), radius, innerRadius);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Donut) {
		  Donut temp = (Donut)o;
		  if(super.equals(temp) && innerRadius == temp.getInnerRadius()) {
			  return true;
		  }
		}
		return false;
	}
	
	
	public int getInnerRadius() {
		return innerRadius;
	}
	
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
