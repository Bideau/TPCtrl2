package TPCtrl2;

import java.io.PrintStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		switch(args.length){
			case (1) :
				Euros euro = new Euros(Double.parseDouble(args[0]));
				System.out.println(euro);
			case(2) :
				Dollars dollar = new Dollars(Double.parseDouble(args[0]));
				System.out.println(dollar);
				break;
			default :
				System.out.println("Il n'y a pas d'argument");
		}
		//Monnaie mon = new Monnaie (5,"test");
		Euros euro1 = new Euros(20);
		Euros euro2 = new Euros(1);
		Dollars dolls = new Dollars(1);
		System.out.println(euro1.taxe(19.6));
		System.out.println(Monnaie.conversion(dolls));
		System.out.println(Monnaie.conversion(euro2));
		Tirelire tir = new Tirelire ();
		try//2e
	    {
	      PrintStream ps=new PrintStream("Tirelire.txt");
	      ps.println(tir);
	      ps.close();
	    }
	    catch (Exception e)
	    {
	      System.out.println(e);
	    }
	}

}
