package TPCtrl2;
import java.util.List;
import java.util.ArrayList;

public class Tirelire extends ArrayList<Monnaie> {

	List<Monnaie> liste;//2a
	Tirelire()//2b
	{
		liste=new ArrayList<Monnaie>();
		liste.add(new Euros(5));
		liste.add(new Euros(10));
		liste.add(new Dollars(1));
		liste.add(new Dollars(2));
	}
	
	public void additionE(Tirelire liste){
		int i;
		double result=0;
		String tampon;
		Monnaie mon;
		Dollars dolls;
		Euros euro;
		for (i=0;i<liste.size();i++){
			mon = liste.get(i);
			tampon = mon.getName();
			if(tampon.equals("Dollars")){
				dolls =new Dollars(mon.getValue());
				euro = Monnaie.conversion(dolls);
				result = euro.getValue();
			}else if(tampon.equals("Euros")){
				euro = new Euros(mon.getValue());
				result = euro.getValue();
			}
		}
		System.out.println(result);
	}
}
