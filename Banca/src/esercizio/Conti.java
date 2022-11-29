package esercizio;

public class Conti {
	
	private String iban;
	private double saldo;
	
	
	public Conti(String iban, double saldo) {
		this.iban = iban;
		this.saldo=saldo;
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	


	public String getIban() {
		return iban;
	}



	public void setIban(String iban) {
		this.iban = iban;
	}



	public boolean preleva(double a) {
		boolean cont;
		if(saldo>0) {
			cont=true;
			
		}else {
			cont=false;
		}
		
		return cont;
	}
	
	public boolean deposita(double a) {
		
		return true;
	}



	@Override
	public String toString() {
		System.out.println();
		return "Conto [iban=" + iban + ", saldo=" + saldo + "]";
	}
	
	
	

}
