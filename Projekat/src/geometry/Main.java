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
	}

}
