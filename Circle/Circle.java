/**
	Represents a Circle with a radius and a center point
	@author CS 1073 Instructors
*/
public class Circle{
	/**
	 The radius of the circle
	*/
	private double radius;

	/**
		The center point of the circle
	*/
	private CartesianPoint center;

	/**
		Creates a circle object with the given center point and radius

		@param centerIn an object representing the center point
		@param radiusIn the radius of the new circle
	*/
	public Circle(CartesianPoint centerIn, double radiusIn){
		radius = radiusIn;
		center = centerIn;
	}

	/**
		Creates a circle object with the given center point and radius

		@param x the x-coordinate of circle's the center point
		@param y the y-coordinate of circle's the center point
		@param radiusIn the radius of the new circle
	*/
	public Circle(double x, double y, double radiusIn){
		center = new CartesianPoint(x, y);
		radius = radiusIn;
	}

	/**
		Returns the center point of the circle.
		@return the center point of the circle
	*/
	public CartesianPoint getCenter(){
		return center;
	}

	/**
		Return the radius of the circle.
		@return the circle's radius
	*/
	public double getRadius(){
		return radius;
	}

	/**
		Sets a new center point for the object.
		@param centerIn the new center point of the circle
	*/
	public void setCenter(CartesianPoint centerIn){
		center = centerIn;
	}

	/**
		Sets the radius of the circle.
		@param radiusIn the new radius of the circle.
	*/
	public void setRadius(double radiusIn){
		radius = radiusIn;
	}

	public double distanceTo(Circle input) {
		
		if(contains(input) == true) {
			return 0;
		
		else if(intersects(input) == true) {
			return 0;
		} else { 
			return center.distance(input.getCenter()) - radius - input.getRadius();		
		}
	}	 
}

	public boolean intersects(Circle input) {
		boolean intersects;
		if(center.distance(input.getCenter()) < radius + input.getRadius()) {
			intersects = true;
		} else {
			intersects = false;
		}
		return intersects;
	}
	
	
	public boolean contains(Circle other) {

	}


	public boolean contains(CartesianPoint input) {
		//radius minus the distance from center to point 

		double cartesianDistance = radius - center.distance(input);

		if(cartesianDistance < radius) {
			return true;
		} else {
			return false;
		}

	}
	
}