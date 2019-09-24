package br.cresol.coop.treinamento;

public class Surfista {

	public String nome;
	public int idade;
	public int posicaoCT;
	
	public Surfista(String nome, int idade, int posicaoCT) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.posicaoCT = posicaoCT;
	}
	
	public Surfista(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	

	public String getNome() {
		return nome;
	}



	public int getIdade() {
		return idade;
	}



	public int getPosicaoCT() {
		return posicaoCT;
	}



	@Override
	public String toString() {
		return "Surfista [nome=" + nome + ", idade=" + idade + ", posicaoCT=" + posicaoCT + "]";
	}
	
}
