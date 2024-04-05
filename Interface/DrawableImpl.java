package Interface;

public class DrawableImpl implements Drawable, Printable {
	public static void main(String[] args) {
		Drawable drawable = new DrawableImpl();
		drawable.print();
		drawable.cube(7);
		Drawable.square(25);
	}

	@Override
	public void print() {
		float r = 10;
		System.out.println("Area of circle : " + (PI * r * r));
	}

	public void display() {
		System.out.println("method from another interface");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Printable.super.show(); //for use ambiguity issue
	}
}
