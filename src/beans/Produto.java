package beans;

public class Produto {

	private String nome;
	private String marca;
	private float valor;
	private boolean promocao;

	public Produto () {
		
	}

	// Construtor
	
	public Produto(String nome, String marca, float valor) {
	this.nome = nome;
	this.marca = marca;
	this.valor = valor;	
		
	}
	
	public Produto(String nome, String marca, float valor, boolean promocao) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.promocao = promocao;
	}
	
	// Getters + Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	// Métodos + Operações
	public String Detalhes() {
		return "Produto :" + this.nome + " valor: " + this.valor;

	}

}
