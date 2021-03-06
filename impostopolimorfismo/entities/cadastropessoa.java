package entities;

public abstract class cadastropessoa {
	
	private String nome;
	private double rendaAnual;
	
	public cadastropessoa(String nome, double rendaAnual) {		
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double imposto();	

}
