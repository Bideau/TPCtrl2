package TPCtrl2;

public class Dollars extends Monnaie {
	
	Dollars(double value) {
		super(value, "Dollars");
		
	}
	public double taxe(double coef){
		double result=0;
		result = value*((coef/100)+1);
		return result;
	}
}
