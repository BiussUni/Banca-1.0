package esercizio;

public class Main {

	public static void main(String[] args) {
		Banca b =new Banca("SanPaolo",10);
		Conti c =new Conti("dsfafasdf",20.0);
		Conti f =new Conti("sdafasdf",50.0);
		b.aggiungiConto(c);
		
		b.aggiungiConto(f);
		
		
		b.getConto(c, "sdafasdf");
		
	}

}
