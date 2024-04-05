package Practice;

public class DateP {
	double DD, MM, YY;

	public DateP() {
		DD = 04;
		MM = 03;
		YY = 2024;
	}

	public DateP(double DD, double MM, double YY) {
		this.DD = DD;
		this.MM = MM;
		this.YY = YY;
	}
	public void display() {
		System.out.println(DD+"-"+MM+"-"+YY);
		
	}
	
}
