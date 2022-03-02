package week9;

public enum Planet {
MERCURY, 
VENUS, 
EARTH("This is where i live", 3.5e23,3.1e+5), 
MARS("it is beautifyull"), 
JUPITER, 
SATURN, 
URANUS, 
NEPTUNE;
	
	private String desc;
	private double mass;
	private double radius;
	
	Planet (String desc, double mass, double radius){
		
		this.desc=desc;
		this.mass=mass;
		this.radius=radius;
	}
	Planet(){
		desc="";
		mass=0;
		radius=0;
	}
	Planet (String desc){
		this.desc=desc;
		
	}
	public String getDesc() {
		return desc;
	}
	public double getMass() {
		return mass;
	}
	public double getRadius() {
		return radius;
	}
	
	public final double G =6.67E-11;
	public double surfaceGravity() {
		double gravity =G *mass/(radius*radius);
		return gravity;
	}
}
