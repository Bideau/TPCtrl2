package TPCtrl2;

public class Euros extends Monnaie{

	Euros(double value) {
		super(value, "Euros");
		
	}
	public double taxe(double coef){
		double result=0;
		result = value*((coef/100)+1);
		return result;
	}
	public double add(Euros euro){
		double result=0;
		result = euro.value+this.value;
		return result;
	}

}
