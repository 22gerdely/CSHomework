
public class Fan {

	public static final int SLOW = 1;
	public static final int MEDUIM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean getOn() {
		return on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		if (on == true) {
			return "The fan speed is " + speed + " the color is " + color + " and the radius is " + radius + ".";
		}else {
			return "The fan color is " + color + " the radius is " + radius + " and the fan is off";
		}
	}
}
