package TPCtrl2;
/****************************
Carre(1.2): 1.44
Rectangle(4.0,2.0) : 8.0
Rectangle(1.0,2.0) : 2.0
Carre(3.0): 9.0
Total : 20,440000
****************************/
interface Surface
{
	public double surface();
}
/************/
abstract class Forme implements Surface
{
	double a,b;
	public String toString() {
		return "Forme ("+a+","+b+") : "+surface();
	}
	abstract public double surface();
}
/************/
public class Rectangle extends Forme
{
	Rectangle(double l,double L) {
		a=l;
		b=L;
	}
	public String toString() {
		return "Rectangle("+a+","+b+") : "+surface();
	}
	public double surface()
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		Surface[] tab=new Surface[4];
		tab[0]=new Carre(1.2);
		tab[1]=new Rectangle(4,2);
		tab[2]=new Rectangle(1,2);
		tab[3]=new Carre(3.0);
		double x=0;
		for (Surface s:tab)
		{
			System.out.println(s);
			x+=s.surface();
		}
		System.out.println("Total : "+x+" \n");
	}
}
/************/
class Carre extends Rectangle
{
	Carre(double l) {
		super(l,l);
	}
	public String toString() {
		return "Carre("+a+"): "+surface();
	}
}