public class TestDriver {
	public static void main(String [] args) {

		Circle C1 = new Circle(150, 150, 70);
		Circle C2 = new Circle(200, 200, 100);
		Circle C3 = new Circle(250, 250, 50);
		Circle C4 =  new Circle(300, 300, 50);

		if(C1.intersects(C2) == true) {
			System.out.println("C1 intersects with C2");
		} else {
			System.out.println("C1 is " + C1.distanceTo(C2) + " away from C2");
		}

		if(C1.intersects(C3) == true) {
			System.out.println("C1 intersects with C3");
		} else {
			System.out.println("C1 is " + C1.distanceTo(C3) + " away from C3");
		}

		if(C1.intersects(C4) == true) {
			System.out.println("C1 intersects with C4");
		} else {
			System.out.println("C1 is " + C1.distanceTo(C4) + " away from C4");
		}


		if(C2.intersects(C3) == true) {
			System.out.println("C2 intersects with C3");
		} else {
			System.out.println("C2 is " + C2.distanceTo(C3) + " away from C3");
		}

		if(C2.intersects(C4) == true) {
			System.out.println("C2 intersects with C4");
		} else {
			System.out.println("C2 is " + C2.distanceTo(C4) + " away from C4");
		}


		if(C3.intersects(C4) == true) {
			System.out.println("C3 intersects with C4");
		} else {
			System.out.println("C3 is " + C3.distanceTo(C4) + " away from C4");
		}
	}
}