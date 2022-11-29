package esercizio;

import java.util.ArrayList;

public class Banca {
	
	private String nome;
	private int nuMax;
	private ArrayList<Conti> conti;
	private int nuAtt;
	private String radIb;
	
	
	

	public Banca(String nome, int nuMax) {
		this.nome = nome;
		this.nuMax = nuMax;
		this.conti=new ArrayList<>(nuMax);
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getNuMax() {
		return nuMax;
	}



	public void setNuMax(int nuMax) {
		this.nuMax = nuMax;
	}



	public ArrayList<Conti> getConti() {
		return conti;
	}



	public void setConti(ArrayList<Conti> conti) {
		this.conti = conti;
	}



	public int getNuAtt() {
		return nuAtt;
	}



	public void setNuAtt(int nuAtt) {
		this.nuAtt = nuAtt;
	}



	public String getRadIb() {
		return radIb;
	}



	public void setRadIb(String radIb) {
		this.radIb = radIb;
	}



	public void aggiungiConto(Conti c) {
		 
		conti.add(c);
		System.out.println("conto attivato "+c.toString());
		
		
	}
	
	public void stampa() {
		for(int i=0;i<conti.size();i++) {
			System.out.println(conti.get(i));
		}
	
		
	}
	public double totaleSaldi(Conti c) {
		
		double totale=0;
		for(int i=0;i<conti.size();i++) {
			totale=+c.getSaldo();
		}
		return totale;
	}
	
	
	public void getConto(Conti c,String iban) {
		
		for(int i=0;i<nuMax;i++) {
			if(iban.equals(c.getIban())) {
				System.out.println(conti.get(i));
			}
		}
		
	}
	
	public void operazione(Conti c,double a) {
		if(a>=0) {
			c.deposita(a);
			c.setSaldo(c.getSaldo()+a);
		}else {
			c.preleva(a);
			c.setSaldo(c.getSaldo()+a);
		}
		
	}

	
	
	
}
