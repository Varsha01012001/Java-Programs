package JunitTesting;

public class Apple {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean checkColor() {
		if(color.equalsIgnoreCase("Green")|| color.equalsIgnoreCase("Red"))
			return true;
		else
		return false;
	}
}
