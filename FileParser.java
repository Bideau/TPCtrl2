package TPCtrl2;

public class FileParser {
	private int taille;
	protected String nomFic;
	protected int[] stats= new int [taille];
	
	FileParser(){
		this.nomFic="tampon.txt";
		for(int i =0;i<taille;i++){
			this.stats[i]=i;
		}
	}

}
