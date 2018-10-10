/**
	Represents a Circle with a radius and a center point
	@author CS 1073 Instructors
	@author Noah Clements 3585596
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

	/**
		determines the closest distance from one circle to another circle.
		@param input Circle constructor method 
		@return returns a double to tell the closest distance from one circle to another
	*/
	public double distanceTo(Circle input) {
		double distanceTo;
		if(contains(input) == true) {			// if the circle contains another circle within it, distanceTo is 0
			distanceTo = 0;
		} else if(intersects(input) == true) {	// if the circle intersects with another circle, distanceTo is 0
			distanceTo = 0;
		} else { 
			distanceTo = center.distance(input.getCenter()) - radius - input.getRadius();	
				// if both are false, distanceTo is the distance from both center points minus the radius of both circles
		}
		return distanceTo; 
	}	 

	/**
		checks to see if one circle intercepts with another circle 
		@param input the circle were comparing to
		@return returns a boolean to tell whether a circle intercepts with another circle
	*/
	public boolean intersects(Circle input) {
		boolean intersects;
		if(center.distance(input.getCenter()) < radius + input.getRadius()) {	
		// if the distance between two center points of circles is LESS than both of the circle's radius' combined...
			intersects = true; // the boolean "intersects" would equal true 
		} else {
			intersects = false; // if the distance is MORE than both of the circle's radius' combined, the boolean would equal false
		}
		return intersects;
	}
	
	/**
		Checks to see if a circle contains another circle within it
		@param other the circle were comparing to
		@return returns a boolean to tell whether a circle contains another circle within it
	*/
	public boolean contains(Circle other) {
		//double circleDistance = radius - other.getRadius();
		boolean containsCircle;
		if(center.distance(other.getCenter()) <= (radius - other.getRadius())) {	
		// if the distance between two center points of circles is less than or equal to the radius of the first circle 
		// minus the second circles radius, the boolean "containsCircle" will be true
			containsCircle = true;
		} else {
			containsCircle = false;	
		}
		return containsCircle;
	}

	/**
		Checks to see if a circle contains a cartesian point within it
		@param input the CartesianPoint were comparing to
		@return returns a boolean to tell whether a circle contains another cartesian point
	*/
	public boolean contains(CartesianPoint input) {
		//radius minus the distance from center to point 
		boolean containsCartesian;
		if(center.distance(input) < radius) { 
		// if the distance between two circles is less than the radius of the first circle, "containsCartesian" will be true
			containsCartesian = true;
		} else {
			containsCartesian = false;
		}
		return containsCartesian;
	}
	
}