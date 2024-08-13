package pacote1;

public class Exemplos {
	private int codigo;
	
	private long codigoMaior;
	
	private float valorDecimal;
	
	private double valorDecimal1;
	
	private String texto = "quero trancar o curso";
	
	private boolean status = false;
	
	private short curto;
	
	private byte bi;
	
	
	public Exemplos() {
		
	}
	public Exemplos(int val) {
		this.codigo = val;
	}
	
	public String retornaTexto() {
		return "olá";
	}
	
	public int retornaInteiro() {
		int val = 50;
		return val;
	}
	
	public long retornaLong(long num) {
		return num;
	}
}
