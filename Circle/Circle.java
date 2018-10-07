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

	private boolean intersects;
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

	public double distanceTo(CartesianPoint input) {
		if(containsCartesianPoint(input) == true) {
				return 0;
			
		} else {
			return center.distance(input);
		}
		 
	}

	public boolean intersects(CartesianPoint input) {
		if(center.distance(center) == 0) {
			intersects = true;
		} else {
			intersects = false;
		}
		return intersects;
	}
/*
	public boolean containsCircle(Circle other) {
		if(center - other)
	}

*/
	public boolean containsCartesianPoint(CartesianPoint input) {
		boolean containsCartesian;
		if(center.distance(input) < radius + getRadius()) {
			containsCartesian = true;	
		} else {
			containsCartesian = false;
		}
		return containsCartesian;
	}
	
}