package TPCtrl2;

import java.util.ArrayList;

public abstract class Monnaie {
	protected double value;
	private String name;
	
	Monnaie(double value, String name){
		try {
			if(value>0){
				this.value=value;
			}
		}catch(Exception e){
			
		}
		this.name=name;
	}
	public String toString() {
		return value+" "+name;
	}
	
	/** Getter de la valeur */
	public double getValue(){
		return value;
	}
	/** Getter du nom */
	public String getName(){
		return name;
	}
	
	public static Euros	conversion(Dollars d){
		Euros euro = new Euros(1);
		euro =new Euros(d.value*0.78);
		return euro;
	}
	
	public static Dollars conversion(Euros e){
		Dollars dolls = new Dollars(1);
		dolls =new Dollars(e.value*1.281);
		return dolls;
	}

	public abstract double taxe(double coef);


}
