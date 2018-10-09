public class TestDriver {
	public static void main(String [] args) {

		Circle C1 = new Circle(150, 150, 70);
		Circle C2 = new Circle(200, 200, 100);
		Circle C3 = new Circle(250, 250, 50);
		Circle C4 =  new Circle(300, 300, 50);

		System.out.println(C1.getCenter());
		System.out.println(C1.getRadius());

		System.out.println(C2.getCenter());
		System.out.println(C2.getRadius());

		//C1.intersects(C2);
		System.out.println(C1.distanceTo(C2));

		System.out.println(C1.distanceTo(C4));




	}
}