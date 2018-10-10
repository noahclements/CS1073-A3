/** 
	Represents the driver class for the CartesianPoint and Circle class
	@author Noah Clements 3585596
*/
public class CircleDriver {
	public static void main(String [] args) {

		Circle C1 = new Circle(150, 150, 70);
		Circle C2 = new Circle(200, 200, 100);
		Circle C3 = new Circle(250, 250, 50);
		Circle C4 =  new Circle(300, 300, 50);

		// C1 conditional statements
		if(C1.intersects(C2) == true) {
		if(C1.contains(C2) == true) {
			System.out.println("C1 contains C2");
		} else {
			System.out.println("C1 intersects with C2");
		}
	} else {
		System.out.println("C1 is " + C1.distanceTo(C4) + " away from C2");
	}


		if(C1.intersects(C3) == true) {
		if(C1.contains(C3) == true) {
			System.out.println("C1 contains C3");
		} else {
			System.out.println("C1 intersects with C3");
		}
	} else {
		System.out.println("C1 is " + C1.distanceTo(C3) + " away from C3");
	}



		if(C1.intersects(C4) == true) {
		if(C1.contains(C4) == true) {
			System.out.println("C1 contains C4");
		} else {
			System.out.println("C1 intersects with C4");
		}
	} else {
		System.out.println("C1 is " + C1.distanceTo(C4) + " away from C4");
	}


		// C2 conditional statements
		if(C2.intersects(C3) == true) {
		if(C2.contains(C3) == true) {
			System.out.println("C2 contains C3");
		} else {
			System.out.println("C2 intersects with C3");
		}
	} else {
		System.out.println("C2 is " + C2.distanceTo(C3) + " away from C3");
	}


		if(C2.intersects(C4) == true) {
		if(C2.contains(C4) == true) {
			System.out.println("C2 contains C4");
		} else {
			System.out.println("C2 intersects with C4");
		}
	} else {
		System.out.println("C2 is " + C2.distanceTo(C4) + " away from C4");
	}

		// C3 conditional statements 

		if(C3.intersects(C4) == true) {
		if(C3.contains(C4) == true) {
			System.out.println("C3 contains C4");
		} else {
			System.out.println("C3 intersects with C4");
		}
	} else {
		System.out.println("C3 is " + C3.distanceTo(C4) + " away from C4");
	}


		Circle C5 = new Circle(350, 350, 50);

		if(C1.intersects(C5) == true) {
		if(C1.contains(C5) == true) {
			System.out.println("C1 contains C5");
		} else {
			System.out.println("C1 intersects with C5");
		}
	} else {
		System.out.println("C1 is " + C1.distanceTo(C5) + " away from C5");
	}

	
		if(C2.intersects(C5) == true) {
		if(C2.contains(C5) == true) {
			System.out.println("C2 contains C5");
		} else {
			System.out.println("C2 intersects with C5");
		}
	} else {
		System.out.println("C2 is " + C2.distanceTo(C5) + " away from C5");
	}

		
		if(C3.intersects(C5) == true) {
		if(C3.contains(C5) == true) {
			System.out.println("C3 contains C5");
		} else {
			System.out.println("C3 intersects with C5");
		}
	} else {
		System.out.println("C3 is " + C3.distanceTo(C5) + " away from C5");
	}


		if(C4.intersects(C5) == true) {
		if(C4.contains(C5) == true) {
			System.out.println("C4 contains C5");
		} else {
			System.out.println("C4 intersects with C5");
		}
	} else {
		System.out.println("C4 is " + C4.distanceTo(C5) + " away from C5");
	}



	Circle C6 = new Circle(450, 450, 30);
	Circle C7 = new Circle(350,350, 30);


	if(C5.intersects(C6) == true) {
		if(C5.contains(C6) == true) {
			System.out.println("C5 contains C6");
		} else {
			System.out.println("C5 intersects with C6");
		}
	} else {
		System.out.println("C5 is " + C5.distanceTo(C6) + " away from C6");
	}

	if(C5.intersects(C7) == true) {
		if(C5.contains(C7) == true) {
			System.out.println("C5 contains C7");
		} else {
			System.out.println("C5 intersects with C7");
		}
	} else {
		System.out.println("C5 is " + C5.distanceTo(C7) + " away from C7");
	}



	if(C6.intersects(C7) == true) {
		if(C6.contains(C7) == true) {
			System.out.println("C6 contains C7");
		} else {
			System.out.println("C6 intersects with C7");
		}
	} else {
		System.out.println("C6 is " + C6.distanceTo(C7) + " away from C7");
	}

	




	




	}
}