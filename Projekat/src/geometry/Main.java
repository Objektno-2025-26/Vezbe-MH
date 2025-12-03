package geometry;

public class Main {

	public static void main(String[] args) {
//		Vezbe 3
		Point p1 = new Point();
//		p1.x = 20;
		p1.setY(10);
		p1.setSelected(true);
		System.out.println(String.format("Stanje objekta p1 je: x: %s, y: %s, "
				+ "selected: %s",p1.getX(), p1.getY(), p1.isSelected()));
		Point p2 = new Point();
//		p2.y = p1.y;
//		p1.y = 50;
		
		System.out.println(p1);
		System.out.println(p2);
		p2 = p1;
		System.out.println(p2);
		p2.setY(50);
		
		System.out.println(String.format("Stanje objekta p2 je: x: %s, y: %s, "
				+ "selected: %s",p2.getX(), p2.getY(), p2.isSelected()));
//		===========================================================
//		Vezbe 4
		Line l1 = new Line();
		l1.setStartPoint(p1);
		p1.setX(10);
		l1.getStartPoint().setX(15);
		l1.setEndPoint(new Point());
//		p2 = l1.getEndPoint();
//		p2.setX(15);
		System.out.println(l1);
		System.out.println(l1.getStartPoint());
		System.out.println(l1.getEndPoint());
//		System.out.println(l1.getEndPoint().getX());
		System.out.println(l1.length());
		
		Circle c1 = new Circle();
		c1.setCenter(new Point());
		c1.getCenter().setX(20);
		c1.getCenter().setY(10);
		c1.setRadius(10);
		System.out.println(String.format("Vrednosti kruga su - "
				+ "Centar X: %s, Centar Y: %s, radius: %s"
				,c1.getCenter().getX(), c1.getCenter().getY(), c1.getRadius() ));
		System.out.println(String.format("Povrsina kruga je: %s, a obim: %s", 
				c1.area(), c1.circumference()));
		
		
		
		
		
		
	}

}
