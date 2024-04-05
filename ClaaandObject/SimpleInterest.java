package ClaaandObject;

public class SimpleInterest {
	double principleAmt,rate,years;
	
	public SimpleInterest()//default
	{
		principleAmt = 25000;
		rate = 6.7;
		years = 2;
	}
	public SimpleInterest(double principleAmt,double rate,double years) {
		this.principleAmt=principleAmt; //instance variable call from constructor then use this key word
		this.rate = rate;
		this.years=years;
		}
	public void calculate() {
		double interest = principleAmt*rate*years/100;
		System.out.println("Simple Interest :"+interest);
	}
	public static void main(String[]args) {
		SimpleInterest interest1 = new SimpleInterest();
		interest1.calculate();
		
		SimpleInterest interest2=new SimpleInterest();
		interest2.calculate();
	}
}
